package part2130.part5;

public class Consumer implements Runnable{

    private Data data;
    public Consumer(Data data){
        this.data=data;
    }
    @Override
    public void run() {
        while(true){
            try {
                System.out.println("消费："+data.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
