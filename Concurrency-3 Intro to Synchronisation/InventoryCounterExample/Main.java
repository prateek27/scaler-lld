package Multithreading.InventoryCounterExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        InventoryCounter counter = new InventoryCounter();
        Lock lock = new ReentrantLock();


        System.out.println(counter.count);

        Thread t1 = new Thread(new Adder(counter,lock));
        Thread t2 = new Thread(new Subtracter(counter,lock));
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
