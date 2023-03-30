package part2130.part2;

/**
 * 非阻塞式获取锁的方式
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        //Task2 task2 = new Task2();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
