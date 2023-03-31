package part3140.part8;

/**
 * 演示线程间如何共享ThreadLocal
 */
public class Main {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.start();
    }
}
