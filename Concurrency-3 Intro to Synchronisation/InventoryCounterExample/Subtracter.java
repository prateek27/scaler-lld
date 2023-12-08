package Multithreading.InventoryCounterExample;

import java.util.concurrent.locks.Lock;

public class Subtracter implements Runnable{
    private InventoryCounter counter;
    private Lock lock;
    public Subtracter(InventoryCounter counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=1; i<=10000;i++){
            lock.lock();
            this.counter.count--;
            lock.unlock();
        }
    }
}
