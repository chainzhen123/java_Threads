package part2130.part1;

/**
 * 演示lock
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task(); //创建任务
        Thread thread1 = new Thread(task);   //创建线程
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();   //运行结果，两个线程依次打印输出线程名字
    }
}
