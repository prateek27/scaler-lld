package Multithreading.InventoryCounterSynchronized;

public class InventoryCounter {
    private int count;
    public InventoryCounter(){
        this.count = 0;
    }
    public synchronized void increment(){
        this.count++;
    }
    public synchronized void decrement(){
        this.count--;
    }
    public int getCount(){
        return count;
    }

}
