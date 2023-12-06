package Multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from "+Thread.currentThread().getName());

        //How do I create another thread?
        Thread t1 = new Thread(new Task());
        Thread t2 = new Thread(new Task());
        t1.start();
        t2.start();

        System.out.println("We are done!");
    }
}
