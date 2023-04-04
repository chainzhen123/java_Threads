package part5sync.part2;

/**
 * 演示线程池（有问题？？？？）
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class syncDemo5 {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        // 循环创建5个任务
        for(int i=1; i<6; i++){
            Runnable runn = new Runnable(){
                public void run(){
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName()+":"+"这是我要做的任务和工作");
//                    try {
//                        Thread.sleep(5000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(t.getName()+":"+"任务已执行完毕");
                }
            };

            threadPool.execute(runn);  //把任务交给线程池
            System.out.println("将任务"+i+"指派给了线程池");
        }

        threadPool.shutdownNow();    //执行完任务后关闭线程池
        System.out.println("停止了线程池");
    }
}


