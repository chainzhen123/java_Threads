package part2130.part6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 可重入锁
 */
public class Main3 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        lock.lock();
        try{
            System.out.println("第一次获取锁");
            lock.lock();
            try{
                System.out.println("第二次获取锁");
            } catch (Exception e) {
                e.printStackTrace();
            }finally{
                lock.unlock();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            lock.unlock();
        }

    }
}
