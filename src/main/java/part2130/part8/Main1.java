package part2130.part8;

/**
 * 演示读锁
 */
public class Main1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Thread thread0 = new Thread(task1);
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task1);

        thread0.start();
        thread1.start();
        thread2.start();

    }
}
