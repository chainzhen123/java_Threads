package part2130.part4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * 演示await
 */
public class Task implements Runnable{

    private Lock lock;
    private Condition condition;
    public Task(Lock lock,Condition condition){
        this.lock=lock;
        this.condition=condition;
    }
    @Override
    public void run() {
        lock.lock();  //获取锁
        try {
            condition.await();  //使当前线程等待
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            lock.unlock(); //释放锁
        }
    }
}
