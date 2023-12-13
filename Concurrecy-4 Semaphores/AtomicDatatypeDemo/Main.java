package Multithreading.AtomicDatatypeDemo;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        InventorCounter ic = new InventorCounter();
        Thread t1 = new Thread(new Adder(ic));
        Thread t2 = new Thread(new Subtracter(ic));
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(ic.counter.get());
    }
}
