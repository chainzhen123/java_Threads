package part3140.part7;

public class Main2 {
    public static void main(String[] args) {
        //创建ThreadLocal
        ThreadLocal<String> tl = new ThreadLocal<>();
        //创建线程0
        Thread thread0 = new Thread(){
            public void run(){
                //设置ThreadLocal在当前线程中保存的变量副本
                tl.set("Thread0");
                //获取ThreadLocal在当前线程中保存的变量副本
                System.out.println(tl.get());
            }
        };
        //创建线程1
        Thread thread1 = new Thread(){
            public void run(){
                //设置ThreadLocal在当前线程中保存的变量副本
                tl.set("Thread1");
                //获取ThreadLocal在当前线程中保存的变量副本
                System.out.println(tl.get());  //输出结果是null，因为跨线程了
            }
        };
        thread0.start();
        thread1.start();


    }
}

