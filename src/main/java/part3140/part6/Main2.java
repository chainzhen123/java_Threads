package part3140.part6;

public class Main2 {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();  //线程启动

        try {
            Thread.sleep(3000);  //主线程休眠3秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (task){    //主线程获得锁，thread线程正在等待
            System.out.println(Thread.currentThread().getName());
            System.out.println(thread.getState());   //打印thread线程目前状态
            task.notify();   //唤醒等待的线程（thread线程可以执行wait()方法之后的代码了）
        }
    }
}
