package part2130.part1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task implements Runnable{
    /**
     * 当我们new一个ReentrantLock对象时，底层会帮我们new一个NonfairSync对象，
     * NonfairSync FairSync都是基于AQS队列实现，AbstractQueuedSynchronizer简称为AQS队列
     */
    private Lock lock = new ReentrantLock();   //获取一个lock的实例？？

    @Override
    public void run() {
        lock.lock();   //获取锁
        try {
            Thread.sleep(2000);   //使当前线程等待两秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());  //输出当前线程的名字
        lock.unlock(); //释放锁
    }
}
