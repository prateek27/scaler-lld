package Multithreading.InventoryCounterSynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Runnable {
    private InventoryCounter counter;
    public Adder(InventoryCounter counter){
        this.counter = counter;

    }

    @Override
    public void run() {
        //Add to the counter 10000 times
        for(int i=1; i<=10000;i++){
            this.counter.increment();
         /*   synchronized (counter) {
                this.counter.count++;
            }*/
        }
    }
}
