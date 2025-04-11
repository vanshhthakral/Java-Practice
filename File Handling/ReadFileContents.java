import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileContents {

    public static void main(String[] args) {
        // Corrected path to the input file
        String filePath = "/Users/vanshthakral/Desktop/sem4/Untitled.txt";

        try {
            File file = new File(filePath);
            Scanner fileReader = new Scanner(file);

            System.out.println("Contents of " + filePath + ":\n");

            // Read and print each line
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found at: " + filePath);
        }
    }
}
