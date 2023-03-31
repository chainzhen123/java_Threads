package part3140.part10;

/**
 * 内存可见性演示2
 */
public class Main2 {

    //volatile表明变量必须同步发生变化
    public static volatile boolean stopped = false;

    public static void main(String[] args) {
        Thread thread = new Thread(){
          public void run(){
              while(!stopped){
                    System.out.println("boolean");
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
