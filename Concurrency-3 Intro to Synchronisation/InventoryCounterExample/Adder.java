package Multithreading.InventoryCounterExample;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Runnable {
    private InventoryCounter counter;
    private Lock lock;
    public Adder(InventoryCounter counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        //Add to the counter 10000 times
        for(int i=1; i<=10000;i++){
            lock.lock();
            this.counter.count++;
            lock.unlock();
        }
    }
}
