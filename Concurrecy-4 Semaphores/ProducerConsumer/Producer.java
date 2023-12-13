package Multithreading.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Object> queue;
    private int maxSize;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Producer(Queue<Object> queue, int maxSize, String name, Semaphore ps, Semaphore cs){
        this.queue = queue;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = ps;
        this.consumerSemaphore = cs;
    }
    @Override
    public void run() {
        while(true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(queue.size()<this.maxSize){
                    System.out.println(this.name + " adding to queue, Size " + queue.size());
                    queue.add(new Object());
                }
            consumerSemaphore.release();
        }
    }
}
