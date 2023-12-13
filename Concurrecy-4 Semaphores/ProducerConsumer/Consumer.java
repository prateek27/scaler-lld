package Multithreading.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private int maxSize;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Consumer(Queue<Object> queue, int maxSize, String name, Semaphore ps, Semaphore cs){
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
                    consumerSemaphore.acquire();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if(queue.size()>0){
                        System.out.println(this.name + " removing from queue, Size " + queue.size());
                        queue.remove();
                    }
                producerSemaphore.release();
            }
    }
}
