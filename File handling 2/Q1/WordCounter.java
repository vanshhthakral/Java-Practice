import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter{
    public static void main(String[] args) {
        String fileName = "input.txt";
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");

                // Handle empty lines
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Total number of words: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
