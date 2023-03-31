package part2130.part9;

public class WriteTask implements Runnable{
    //高并发容器
    private RWDictionary dictionary;
    //有参构造器，传入高并发容器
    public WriteTask(RWDictionary dictionary){
        this.dictionary=dictionary;
    }

    @Override
    public void run() {
        int i = 0;
        while(true){  //无限循环
            try {
                Thread.sleep(1000);  //当前线程休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String name = Thread.currentThread().getName();
            dictionary.put("all is programer",name + "---" + i++);  //存储数据
        }
    }


}
