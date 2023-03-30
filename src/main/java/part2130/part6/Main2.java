package part2130.part6;

/**
 * 可重入锁
 */
public class Main2 {
    public static void main(String[] args) {
         printA();
    }

    //同步锁为Main.class的静态方法
    public static synchronized void printA(){
        System.out.println("第一次获取锁");
        printB();
    }

    //同步锁为Main.class的静态方法
    public static synchronized void printB(){
        System.out.println("第二次获取锁");
    }
}
