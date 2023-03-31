package part3140.part6;

public class Task implements Runnable{
    @Override
    public void run() {
        synchronized (this){
            try {
                //输出线程的状态
            System.out.println(Thread.currentThread().getState());
            wait();  //等待
                //等待完成之后才能继续执行下面代码
            System.out.println(Thread.currentThread().getState());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
