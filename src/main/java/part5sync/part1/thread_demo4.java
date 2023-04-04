package part5sync.part1;

/**
 *    演示后台线程
 */

public class thread_demo4 {
    public static void main(String[] args) {

        Thread t1 = new Thread(){          //第一种创建方式
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("let me go-----");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("已跳水");
            }
        };

        Thread t2 = new Thread(){
            public void run(){
               while(true){
                   System.out.println("no--no--no--no");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
        };

        t1.start();
        t2.setDaemon(true);
        t2.start();
    }
}


