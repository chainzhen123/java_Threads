package part2130.part9;

public class Main {
    public static void main(String[] args) {
        //高并发容器
        RWDictionary dictionary = new RWDictionary();
        //创建读和写的任务，将高并发容器传入
        WriteTask writeTask = new WriteTask(dictionary);
        ReadTask readTask = new ReadTask(dictionary);
        //创建读写线程
        Thread writeThread0 = new Thread(writeTask);
        Thread writeThread1 = new Thread(writeTask);
        Thread writeThread2 = new Thread(writeTask);
        Thread readThread0 = new Thread(readTask);
        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);
        //启动线程
        writeThread0.start();
        writeThread1.start();
        writeThread2.start();
        readThread0.start();
        readThread1.start();
        readThread2.start();

    }
}
