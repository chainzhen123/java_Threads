package part2130.part9;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//高并发容器
public class RWDictionary {
    //key-value容器
    private final Map<String,Object> map = new HashMap();
    //读写锁
    private final ReadWriteLock rwl = new ReentrantReadWriteLock(true);
    //读锁
    private final Lock r = rwl.readLock();
    //写锁
    private final Lock w = rwl.writeLock();

    //返回键对应的值
    public Object get(String key){
        r.lock();  //获取锁
        try {
            return map.get(key);   //返回对应的键值
        }finally{
            r.unlock();
        }
    }

    //返回所有的键
    public String[] allkeys(){
        r.lock();
        try {
            return map.keySet().toArray(new String[0]);  //返回所有的键
        } finally {
            r.unlock();
        }
    }

    //添加键和值，并返回数据
    public Object put(String key,Object value){
        w.lock();
        try {
            return map.put(key,value);
        } finally {
            w.unlock();
        }
    }

    //清空容器
    public void clear(){
        w.lock();
        try {
            map.clear();  //清空容器
        } finally {
            w.unlock();
        }
    }


}
