import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class testcounter{
    public static void main(String[] args) {
        String fileName = "input.txt";
        int count = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals("Test")) {
                        count++;
                    }
                }
            }

            reader.close();
            System.out.println("The word 'Test' occurred " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file '" + fileName + "'. Please make sure it exists.");
        }
    }
}
