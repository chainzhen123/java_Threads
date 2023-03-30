package part1120.part10;

/**
 * 线程间通讯。演示wait和notify的应用，模拟生产和消费
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        //创建生产者、消费者任务
        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);
        //创建生产者、消费者线程
        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);
        //启动线程
        producerThread.start();
        consumerThread.start();

    }
}
