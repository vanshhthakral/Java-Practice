import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWriteIntegers {

    public static void main(String[] args) {
        String inputPath = "/Users/vanshthakral/Desktop/sem4/input.txt";
        String outputPath = "/Users/vanshthakral/Desktop/sem4/output.txt";


        try {
            // Step 1: Read integers from input.txt
            File inputFile = new File(inputPath);
            Scanner scanner = new Scanner(inputFile);

            // Step 2: Write those integers to output.txt
            FileWriter writer = new FileWriter(outputPath);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    writer.write(number + "\n");
                } else {
                    scanner.next(); // Skip non-integer token
                }
            }

            scanner.close();
            writer.close();

            // Step 3: Display contents of output.txt
            System.out.println("Contents of output.txt:\n");

            Scanner outputScanner = new Scanner(new File(outputPath));
            while (outputScanner.hasNextLine()) {
                System.out.println(outputScanner.nextLine());
            }

            outputScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found at: " + inputPath);
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + outputPath);
        }
    }
}
