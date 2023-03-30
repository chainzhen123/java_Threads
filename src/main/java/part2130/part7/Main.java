package part2130.part7;

/**
 * 演示非公平锁1，synchronized是非公平锁
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread0= new Thread(task);
        Thread thread1= new Thread(task);
        Thread thread2= new Thread(task);

        thread0.start();
        thread1.start();
        thread2.start();
    }
}
