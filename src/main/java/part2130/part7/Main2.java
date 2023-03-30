package part2130.part7;

/**
 * 演示非公平锁2，
 */
public class Main2 {
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        Thread thread0= new Thread(task2);
        Thread thread1= new Thread(task2);
        Thread thread2= new Thread(task2);

        thread0.start();
        thread1.start();
        thread2.start();
    }
}
