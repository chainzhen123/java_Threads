package part1120.part8;

public class Task implements Runnable{

    @Override
    public void run() {
        synchronized(this){
            try {
                this.wait();   //一上来就休眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("all is programer");
        }
    }
}
