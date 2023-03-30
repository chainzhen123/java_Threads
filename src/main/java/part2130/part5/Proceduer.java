package part2130.part5;

public class Proceduer implements Runnable{

    private Data data;
    public Proceduer(Data data){
        this.data=data;
    }
    @Override
    public void run() {
        int i=0;
        while(true){
            try {
                data.setMessage("all is programer"+i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
