package part5sync.part1;

/**
 *   演示join方法
 */


public class thread_demo5 {
    public static boolean isFinish=false;
    public static void main(String[] args) {

        final Thread download = new Thread(){    //下载图片线程
            public void run(){
                System.out.println("download--我要开始下载图片了");
                for(int i=0;i<100;i++){
                    System.out.println("download:"+i+"%");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("download--我下载完毕，你展示吧");
                isFinish=true;
            }
        };

        final Thread show = new Thread(){    //展示图片的线程
            public void run(){
                System.out.println("show--加载图片-----");
                try {
                    download.join();   //等待download下载完毕再显示
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(isFinish){
                    System.out.println("show--download已下载完毕");
                }else{
                    System.out.println("加载失败");
                }

            }
        };
        show.start();
        download.start();

    }
}
