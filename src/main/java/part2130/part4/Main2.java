package part2130.part4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * lock的等待唤醒机制，唤醒多个等待的线程signalAll
 */
public class Main2 {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();  //创建锁
        Condition condition = lock.newCondition();  //创建条件

        Task task = new Task(lock,condition); //创建任务
        Thread thread1 = new Thread(task);//创建线程
        Thread thread2 = new Thread(task);//创建线程
        Thread thread3 = new Thread(task);//创建线程
        thread1.start();  //启动线程
        thread2.start();  //启动线程
        thread3.start();  //启动线程

        try {
            Thread.sleep(1000);   //主线程等待1秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lock.lock();  //上锁    ？？这里还需要上锁吗？那await是不是要释放锁资源？？
        condition.signalAll();   //唤醒所有等待的线程
        lock.unlock();  //释放锁

    }
}
