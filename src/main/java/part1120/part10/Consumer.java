package part1120.part10;

public class Consumer implements Runnable{

    private final Data data;

    public Consumer(Data data) {
        this.data = data;
    }

    public void run() {
         //不停地消费
        while(true){
            synchronized(data){
                 //当数据不为空的时候
                if(data.getMessage()!=null){
                    System.out.println("消费： "+ data.getMessage());
                    data.setMessage(null);  //消费数据后将数据重置
                }
                data.notify();  //唤醒生产者线程
                try {
                    data.wait();  //使当前线程等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
