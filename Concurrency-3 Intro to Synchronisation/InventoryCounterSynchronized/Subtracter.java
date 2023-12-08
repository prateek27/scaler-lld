package Multithreading.InventoryCounterSynchronized;


import java.util.concurrent.locks.Lock;

public class Subtracter implements Runnable{
    private InventoryCounter counter;
    private Lock lock;
    public Subtracter(InventoryCounter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=1; i<=10000;i++){
            this.counter.decrement();
 /*           synchronized (counter){
                counter.count--;
            }*/
        }
    }
}
