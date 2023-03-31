package part3140.part7;

//演示ThreadLocal的remove方法
public class Main3 {
    public static void main(String[] args) {
        ThreadLocal<String> tl = new ThreadLocal<>();
        Thread thread0 = new Thread(){
          public void run(){
              //设置ThreadLocal在当前线程中保存的变量副本
              tl.set("thread0");
              //获取ThreadLocal在当前线程中保存的变量副本
              System.out.println(tl.get());
              //删除ThreadLocal在当前线程中保存的变量副本
              tl.remove();
              System.out.println(tl.get());
          }
        };
        thread0.start();
    }
}
