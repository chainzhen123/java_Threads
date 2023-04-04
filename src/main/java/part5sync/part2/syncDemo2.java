package part5sync.part2;

/**
 * 有效缩小同步范围可以在保证并发安全的前提下提高并发执行效率。
 * 使用同步块可以更准确的锁定需要同步的代码片段，而不是将一个方法整体加锁，
 * 这样可以缩小同步范围
 */
public class syncDemo2 {
    public static void main(String[] args) {
        final Shop shop = new Shop();
        final Shop shop2 = new Shop();

        Thread t1 = new Thread(){
            public void run(){
                shop.buy();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                shop.buy();
                //shop2.buy();
            }
        };
        t1.start();
        t2.start();
    }
}

/**
 *同步块
 *synchronized(同步监视器){
 *     需要同步的代码片段
 *}
 * 同步监视器是java中任何一个类的实例即可。但是必须保证该对象于所线程看到的是“同一个”才可以
 * t1和t2都是shop，如果来个shop2，则 不会同步
 */
class Shop{
   public void buy(){
       try {
           Thread t = Thread.currentThread();
           System.out.println(t.getName()+"--正在挑");
           Thread.sleep(5000);

           synchronized(this){  //缩小同步的范围，不是给整个方法都加锁.this 指代的是当前对象
               System.out.println(t.getName()+"--正在试");
               Thread.sleep(5000);
           }

           System.out.println(t.getName()+"--离开");
           Thread.sleep(5000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }

}

