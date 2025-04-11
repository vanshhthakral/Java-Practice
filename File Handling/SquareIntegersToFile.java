import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SquareIntegersToFile {

    public static void main(String[] args) {
        // Update the path based on your system
        String inputPath = "/Users/vanshthakral/Desktop/sem4/input.txt";
        String outputPath = "/Users/vanshthakral/Desktop/sem4/output.txt";

        try {
            File inputFile = new File(inputPath);
            Scanner reader = new Scanner(inputFile);

            FileWriter writer = new FileWriter(outputPath);

            // Read each line, assume each line has one integer
            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                if (!line.isEmpty()) {
                    try {
                        int num = Integer.parseInt(line);
                        int square = num * num;
                        writer.write(num + " " + square + "\n");
                    } catch (NumberFormatException e) {
                        // Skip lines that don't contain a valid integer
                        System.out.println("Skipping invalid line: " + line);
                    }
                }
            }

            reader.close();
            writer.close();

            // Now read and display output.txt
            System.out.println("\nContents of Output.txt:\n");

            Scanner outputReader = new Scanner(new File(outputPath));
            while (outputReader.hasNextLine()) {
                System.out.println(outputReader.nextLine());
            }
            outputReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputPath);
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + outputPath);
        }
    }
}
