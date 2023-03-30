package part2130.part3;

/**
 * 中断等待的线程
 */
public class Main {
    public static void main(String[] args) {
         //Task task = new Task();    //synchronized不可被中断
         Task3 task3 = new Task3();
         Thread thread0 = new Thread(task3);
         Thread thread1 = new Thread(task3);
         thread0.start();
         thread1.start();

        try {
            Thread.sleep(1000);  //主线程休眠1秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread1.interrupt();  //中断线程
    }
}
