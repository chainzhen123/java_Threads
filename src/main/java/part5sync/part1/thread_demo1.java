package part5sync.part1;

/**
 *创建线程方式1,使用Thread创建线程
 */


public class thread_demo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("AAAAAAAA");
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        for(int i=0; i<100;i++){
            System.out.println("BBBBBBB");
        }
    }

}

