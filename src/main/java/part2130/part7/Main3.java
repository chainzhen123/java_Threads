package part2130.part7;

/**
 * 演示公平锁，
 */
public class Main3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        Thread thread0= new Thread(task3);
        Thread thread1= new Thread(task3);
        Thread thread2= new Thread(task3);

        thread0.start();
        thread1.start();
        thread2.start();
    }
}
