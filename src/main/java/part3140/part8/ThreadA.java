package part3140.part8;

public class ThreadA extends Thread{

    public static final InheritableThreadLocal tl = new InheritableThreadLocal();

    public void run(){
        tl.set("ThreadA-----------");
        ThreadB threadB= new ThreadB();
        threadB.start();
    }
}
