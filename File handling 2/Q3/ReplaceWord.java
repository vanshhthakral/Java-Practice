import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReplaceWord {
    public static void main(String[] args) {
        String fileName = "input.txt"; // Input file name

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            System.out.println("Updated file content:\n");

            while ((line = reader.readLine()) != null) {
                // Replace all "test" with "exam" (case-sensitive)
                String updatedLine = line.replace("test", "exam");

                // Print the updated line
                System.out.println(updatedLine);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        }
    }
}
