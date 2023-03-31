package part3140.part7;

public class Main1 {
    public static void main(String[] args) {

        ThreadLocal<String> tl = new ThreadLocal<>();
        Thread thread0 = new Thread(){
            public void run(){
                tl.set("Thread0");
            }
        };

        Thread thread1 = new Thread(){
            public void run(){
                System.out.println(tl.get());  //输出结果是null，因为跨线程了
            }
        };
        thread0.start();
        thread1.start();


    }
}
