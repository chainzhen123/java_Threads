package part1120.part8;

/**
 *演示 wait和notify、notifyAll方法
 */
public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized(task){
            //task.notify();  //唤醒单个线程
            task.notifyAll();
        }
    }
}
