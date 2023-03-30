package part1120.part10;

public class Producer implements Runnable{

    private final Data data;
    public Producer(Data data) {
        this.data=data;
    }

    @Override
    public void run() {
        int i=0;
        //无限生产
        while(true){
            synchronized (data){
                  //当数据为空的时候
                if(data.getMessage() == null){
                      //生产一条数据
                    data.setMessage("all is programer"+ i++);
                    System.out.println("生产：" + data.getMessage());
                }
                data.notify();   //唤醒消费者线程
                try {
                    data.wait();  //生产者线程等待
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
