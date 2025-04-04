class ArraySumCalculator extends Thread {
    private int[] array;
    private int start, end;
    private int segmentSum;

    // Constructor to initialize array segment
    public ArraySumCalculator(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    // Run method to calculate sum of the segment
    public void run() {
        segmentSum = 0;
        for (int i = start; i < end; i++) {
            segmentSum += array[i];
        }
    }

    // Getter for segment sum
    public int getSegmentSum() {
        return segmentSum;
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Array with 9 elements

        // Creating three threads for different segments
        ArraySumCalculator t1 = new ArraySumCalculator(array, 0, 3);
        ArraySumCalculator t2 = new ArraySumCalculator(array, 3, 6);
        ArraySumCalculator t3 = new ArraySumCalculator(array, 6, 9);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        try {
            // Wait for all threads to complete execution
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Calculate total sum
        int totalSum = t1.getSegmentSum() + t2.getSegmentSum() + t3.getSegmentSum();

        // Display results
        System.out.println("Segment 1 Sum: " + t1.getSegmentSum());
        System.out.println("Segment 2 Sum: " + t2.getSegmentSum());
        System.out.println("Segment 3 Sum: " + t3.getSegmentSum());
        System.out.println("Total Sum: " + totalSum);
    }
}
