package part2130.part2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task2 implements Runnable{

    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        //非阻塞式获取锁，设置超时时间，在3秒内拿到锁即可。需要捕获异常
        try {
            if(lock.tryLock(3, TimeUnit.SECONDS)){
                try {
                    Thread.sleep(1000);   //当前线程休眠1秒钟
                    //输出当前线程的名字
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally{
                    lock.unlock();  // 释放锁
                }
            }else{
                System.out.println("锁被占用，执行其他任务");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
