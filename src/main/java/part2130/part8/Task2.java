package part2130.part8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Task2 implements Runnable{

    //读写锁
    private ReadWriteLock readWriteLock  = new ReentrantReadWriteLock(true);
    //写锁
    private Lock writelock = readWriteLock.writeLock();

    @Override
    public void run() {
        writelock.lock();
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            writelock.unlock();
        }
    }
}
