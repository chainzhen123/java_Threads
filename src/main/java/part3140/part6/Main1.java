package part3140.part6;

public class Main1 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        System.out.println(thread.getState());
    }
}
