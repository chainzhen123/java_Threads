package part2130.part3;

public class Task implements Runnable{

    @Override
    public void run() {
        //synchronized不可被中断
        synchronized(this){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
