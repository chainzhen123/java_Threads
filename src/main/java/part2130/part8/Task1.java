package part2130.part8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Task1 implements Runnable{

    //读写锁
    private ReadWriteLock readWriteLock  = new ReentrantReadWriteLock(true);
    //读锁
    private Lock readlock = readWriteLock.readLock();

    @Override
    public void run() {
        readlock.lock();
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            readlock.unlock();
        }
    }
}
