import java.util.Arrays;

class Multiplier extends Thread {
    private int[] input;
    private int[] output;
    private int startIndex;
    private int step;

    // Constructor to initialize input list, output list, start index, and step
    public Multiplier(int[] input, int[] output, int startIndex, int step) {
        this.input = input;
        this.output = output;
        this.startIndex = startIndex;
        this.step = step;
    }

    // Processing elements at even or odd indices
    public void run() {
        for (int i = startIndex; i < input.length; i += step) {
            output[i] = input[i] * 2;
        }
    }
}

public class MultiThreadedMultiplier {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Input list
        int[] output = new int[input.length]; // Output list

        // Creating two threads: one for even indices, one for odd indices
        Multiplier evenThread = new Multiplier(input, output, 0, 2);
        Multiplier oddThread = new Multiplier(input, output, 1, 2);

        // Start both threads
        evenThread.start();
        oddThread.start();

        try {
            // Wait for both threads to complete execution
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Print the output list
        System.out.println("Output List: " + Arrays.toString(output));
    }
}
