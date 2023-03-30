package part2130.part2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task implements Runnable{

    private Lock lock = new ReentrantLock();
    @Override
    public void run() {
        //非阻塞式获取锁，true时锁可用，不可用则往下执行别的代码
        if(lock.tryLock()){
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
    }
}
