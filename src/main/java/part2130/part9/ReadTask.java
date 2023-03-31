package part2130.part9;

public class ReadTask implements Runnable{

    //高并发容器
    private RWDictionary dictionary;
    //有参构造方法
    public ReadTask(RWDictionary dictionary){
        this.dictionary=dictionary;
    }

    @Override
    public void run() {
        while(true){   //无限循环
            try {
                Thread.sleep(1000);  //当前线程休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String [] keys = dictionary.allkeys();  //返回所有的键
            for(String key : keys){     //遍历键，获得值
                Object val = dictionary.get(key);
                System.out.println(key +":"+val);
            }
        }
    }
}
