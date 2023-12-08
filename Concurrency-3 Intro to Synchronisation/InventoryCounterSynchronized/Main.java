package Multithreading.InventoryCounterSynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        InventoryCounter counter = new InventoryCounter();


        System.out.println(counter.getCount());

        Thread t1 = new Thread(new Adder(counter));
        Thread t2 = new Thread(new Subtracter(counter));
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }
}
