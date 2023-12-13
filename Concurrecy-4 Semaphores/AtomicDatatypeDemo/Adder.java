package Multithreading.AtomicDatatypeDemo;

import java.util.concurrent.atomic.AtomicInteger;

public class Adder implements Runnable{
    private InventorCounter ic;

    Adder(InventorCounter ic){
        this.ic = ic;
    }

    @Override
    public void run() {
        for(int i=0;i<=10000;i++){
            ic.counter.addAndGet(1);
        }
    }
}
