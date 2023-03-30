package part2130.part3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task2 implements Runnable{
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        //lock不可被中断
        lock.lock();
        try {
            Thread.sleep(3000);  //当前线程休眠3秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock(); //释放锁
        }
    }
}
