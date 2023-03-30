package part2130.part3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task3 implements Runnable{
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {

        try {
            lock.lockInterruptibly();  //此锁可以被中断
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"被中断");
            return;
        }
        try {
            Thread.sleep(3000);  //当前线程休眠3秒
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock(); //释放锁
        }
    }
}
