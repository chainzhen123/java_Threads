package part3140.part6;

public class Task2 implements Runnable{
    @Override
    public void run() {
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getState());
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
