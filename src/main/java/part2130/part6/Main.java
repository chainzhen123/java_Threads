package part2130.part6;

/**
 * 演示synchronized是可重入锁
 */
public class Main {
    public static void main(String[] args) {
        //同步锁为Main.class的同步代码块
        synchronized(Main.class){
            System.out.println("第一次获取锁");
            //同步锁为Main.class的同步代码块
            synchronized(Main.class){
                System.out.println("第二次获取锁");
            }
        }
    }
}
