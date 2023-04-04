package part5sync.part2;


/**
 * 互斥锁
 * 当synchronized修饰多段不同的代码时，但是锁对象是同一个（如代码中都是boo）
 * 这些代码具有互斥性，即：多个线程不能同时执行这个代码
 * 运行结果：方法A和方法B依次执行
 */
public class syncDemo4 {
    public static void main(String[] args) {
        final Boo boo = new Boo();
        Thread t1 = new Thread(){
            public void run(){
                boo.methodA();
            }
        };
        Thread t2 = new Thread(){
            public void run(){
                boo.methodB();
            }
        };
        t1.start();
        t2.start();
    }
}

class Boo{

    public synchronized void methodA(){     //方法A加同步锁
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":"+"正在执行A方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行A方法结束");
    }

    public synchronized void methodB(){    //方法B加同步锁
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":"+"正在实行B方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行B方法结束");
    }
}


