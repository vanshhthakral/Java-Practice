import java.util.*;

class SharedResource {
    private Queue<Integer> buffer = new LinkedList<>();
    private final int capacity;

    public SharedResource(int capacity) {
        this.capacity = capacity;
    }

    // Producer adds item
    public synchronized void produce(int item) throws InterruptedException {
        // Wait while the buffer is full
        while (buffer.size() == capacity) {
            System.out.println("Buffer full. Producer waiting...");
            wait();
        }
        buffer.add(item);
        System.out.println("Produced: " + item);
        notifyAll(); // Notify consumers
    }

    // Consumer removes item
    public synchronized int consume() throws InterruptedException {
        // Wait while the buffer is empty
        while (buffer.isEmpty()) {
            System.out.println("Buffer empty. Consumer waiting...");
            wait();
        }
        int item = buffer.remove();
        System.out.println("Consumed: " + item);
        notifyAll(); // Notify producers
        return item;
    }
}

class Producer extends Thread {
    private SharedResource resource;
    private int itemsToProduce;

    public Producer(SharedResource resource, int itemsToProduce) {
        this.resource = resource;
        this.itemsToProduce = itemsToProduce;
    }

    public void run() {
        try {
            for (int i = 0; i < itemsToProduce; i++) {
                resource.produce(i);
                Thread.sleep(300); // Simulate time to produce
            }
        } catch (InterruptedException e) {
            System.out.println("Producer interrupted.");
        }
    }
}

class Consumer extends Thread {
    private SharedResource resource;
    private int itemsToConsume;

    public Consumer(SharedResource resource, int itemsToConsume) {
        this.resource = resource;
        this.itemsToConsume = itemsToConsume;
    }

    public void run() {
        try {
            for (int i = 0; i < itemsToConsume; i++) {
                resource.consume();
                Thread.sleep(500); // Simulate time to consume
            }
        } catch (InterruptedException e) {
            System.out.println("Consumer interrupted.");
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        int bufferCapacity = 5;
        int totalItems = 10;

        SharedResource resource = new SharedResource(bufferCapacity);

        Producer producer = new Producer(resource, totalItems);
        Consumer consumer = new Consumer(resource, totalItems);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Production and Consumption complete.");
    }
}
