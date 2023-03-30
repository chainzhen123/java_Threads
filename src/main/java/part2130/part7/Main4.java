package part2130.part7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 判断锁是否是公平的
 */
public class Main4 {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        ReentrantLock lock1 = new ReentrantLock(true);
        System.out.println(lock.isFair());
        System.out.println(lock1.isFair());

    }
}
