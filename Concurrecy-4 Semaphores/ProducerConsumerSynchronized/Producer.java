package Multithreading.ProducerConsumerSynchronized;

import java.util.Queue;

public class Producer implements Runnable{
    private Queue<Object> queue;
    int maxSize;
    String name;

    public Producer(Queue<Object> queue,int maxSize, String name){
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        //Each producer wants to continuously produces
        // T-Shirts and add them to the queue if there is space available

        while(true){
            synchronized (queue){
                if(queue.size()<this.maxSize){
                    System.out.println("Adding - "+ queue.size());
                    queue.add(new Object());
                }
            }
        }
    }
}
