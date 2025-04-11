import java.util.*;

class Multiplier extends Thread {
    private List<Integer> inputList;
    private List<Integer> outputList;
    private int startIndex;
    private int step;

    public Multiplier(List<Integer> inputList, List<Integer> outputList, int startIndex, int step) {
        this.inputList = inputList;
        this.outputList = outputList;
        this.startIndex = startIndex;
        this.step = step;
    }

    public void run() {
        for (int i = startIndex; i < inputList.size(); i += step) {
            outputList.set(i, inputList.get(i) * 2);
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> outputList = new ArrayList<>(Collections.nCopies(inputList.size(), 0));

        Multiplier even = new Multiplier(inputList, outputList, 0, 2);
        Multiplier odd = new Multiplier(inputList, outputList, 1, 2);

        even.start();
        odd.start();

        even.join();
        odd.join();

        System.out.println("Output: " + outputList);
    }
}
