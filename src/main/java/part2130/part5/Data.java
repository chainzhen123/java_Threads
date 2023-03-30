package part2130.part5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Data {

    private Lock lock = new ReentrantLock();
    private Condition producerCondition = lock.newCondition();
    private Condition consumerCondition = lock.newCondition();
    private String message;

    //获取消息
    public String getMessage() throws InterruptedException{
        lock.lock();
        try {
            while(message == null){  //数据为空的时候，让消费者等待
                consumerCondition.await();
            }
            producerCondition.signalAll();  //唤醒生产者
            return message;  //返回数据
        }finally {
            message=null; //重置数据，清空
            lock.unlock();  //释放锁
        }
    }

    //设置消息
    public void setMessage(String message) throws InterruptedException{
        //获取锁
    lock.lock();
     try {
        while(this.message!=null){   //数据不为空的时候让所有生产者线程等待
            producerCondition.await();
        }
        this.message = message;    //设置数据
        System.out.println("生产："+ this.message);
        consumerCondition.signalAll();  //唤醒所有消费者线程
     }finally{
         lock.unlock();
      }
    }
}
