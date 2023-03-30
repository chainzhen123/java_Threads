package part2130.part7;

public class Task implements Runnable{
    @Override
    public void run() {
        while(true){
            synchronized(this){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
