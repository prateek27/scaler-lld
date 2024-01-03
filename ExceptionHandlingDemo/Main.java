package ExceptionHandlingDemo;

public class Main {
    public static void main(String[] args) throws InterruptedException {
            Thread t = new Thread(new SimpleRunnable());
            t.start();
            Thread.sleep(1000);
            t.interrupt();
            System.out.println("Main is over!");
    }
}
