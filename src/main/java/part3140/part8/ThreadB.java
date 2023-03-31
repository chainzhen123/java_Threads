package part3140.part8;

public class ThreadB extends Thread{
    public void run(){
        //获取数据
        System.out.println(ThreadA.tl.get());
    }
}
