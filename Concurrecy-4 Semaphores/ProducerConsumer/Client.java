package Multithreading.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> objects = new ConcurrentLinkedQueue<>();
        int maxSize = 6;
        Semaphore producerSemaphore = new Semaphore(maxSize);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer p1 = new Producer(objects,6,"p1",producerSemaphore,consumerSemaphore);
        Producer p2 = new Producer(objects,6,"p2",producerSemaphore,consumerSemaphore);
        Producer p3 = new Producer(objects,6,"p3",producerSemaphore,consumerSemaphore);

        Consumer c1 = new Consumer(objects,6,"c1",producerSemaphore,consumerSemaphore);
        Consumer c2 = new Consumer(objects,6,"c2",producerSemaphore,consumerSemaphore);
        Consumer c3 = new Consumer(objects,6,"c3",producerSemaphore,consumerSemaphore);
        Consumer c4 = new Consumer(objects,6,"c4",producerSemaphore,consumerSemaphore);
        Consumer c5 = new Consumer(objects,6,"c5",producerSemaphore,consumerSemaphore);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(c1);
        Thread t5 = new Thread(c2);
        Thread t6 = new Thread(c3);
        Thread t7 = new Thread(c4);
        Thread t8 = new Thread(c5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}
