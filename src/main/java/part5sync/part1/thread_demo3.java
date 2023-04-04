package part5sync.part1;

/**
 *创建线程方式3,使用匿名内部类的方式创建
 */

public class thread_demo3 {
    public static void main(String[] args) {

        Thread t1 = new Thread(){          //第一种创建方式
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("AAAAAA");
                }
            }
        };

        Thread t2 = new Thread(new Runnable(){    //第二种创建方式
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("BBBB");
                }
            }
        });
        t1.start();
        t2.start();
    }
}


