package part3140.part10;

/**
 * 内存可见性演示1,运行结果，stopped置为true没有及时得到最新的值
 */
public class Main1 {

    public static boolean stopped = false;

    public static void main(String[] args) {
        Thread thread = new Thread(){
          public void run(){
              while(!stopped){

              }
          }
        };
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopped=true;
    }
}
