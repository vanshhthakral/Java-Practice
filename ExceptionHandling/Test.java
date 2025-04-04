class ThreadFunction1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                System.out.println("ThreadFunction1 interrupted");
            }
            System.out.println("Thread 1 - Iteration: " + i);
        }
    }
}

class ThreadFunction2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(10); // Sleep for 10 milliseconds
            } catch (InterruptedException e) {
                System.out.println("ThreadFunction2 interrupted");
            }
            System.out.println("Thread 2 - Iteration: " + i);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadFunction1());
        Thread t2 = new Thread(new ThreadFunction2());
        
        t1.start(); // Start first thread
        t2.start(); // Start second thread
        
        try {
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Main thread: Done!");
    }
}
