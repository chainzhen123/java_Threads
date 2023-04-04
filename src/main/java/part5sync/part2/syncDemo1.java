package part5sync.part2;

public class syncDemo1 {
    public static void main(String[] args) {
        final Table table = new Table();

        Thread t1 = new Thread(){
            public void run(){
                while(true){
                    int bean=table.getBean();
                    System.out.println(getName()+":"+ bean);
                }
            }
        };
        Thread t2 = new Thread(){
          public void run(){
              while(true){
                  int bean = table.getBean();
                  System.out.println(getName()+":"+bean);
              }
          }
        };
        t1.start();
        t2.start();
    }
}

class Table{
    private int beans=20;
    public synchronized int getBean(){
        if(beans==0){
            throw new RuntimeException("没有了");
        }

        return beans--;
    }
}
