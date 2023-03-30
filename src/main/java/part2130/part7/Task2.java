package part2130.part7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Task2 implements Runnable{

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            lock.lock();
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally{
                lock.unlock();
            }
        }
    }
}
