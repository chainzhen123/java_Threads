package part5sync.part1;

/**
 *创建线程方式2,使用Runnable创建线程
 */


public class thread_demo2 {
    public static void main(String[] args) {
        MyTask1 task1 = new MyTask1();   //创建任务
        MyTask2 task2 = new MyTask2();
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
    }
}

class MyTask1 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("AAAAAA");
        }
    }
}

class MyTask2 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("BBBBBB");
        }
    }

}

