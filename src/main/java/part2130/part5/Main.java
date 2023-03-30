package part2130.part5;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Proceduer proceduer = new Proceduer(data);
        Consumer consumer = new Consumer(data);

        Thread proceduerThread = new Thread(proceduer);
        Thread consumerThread = new Thread(consumer);
        proceduerThread.start();
        consumerThread.start();
    }
}
