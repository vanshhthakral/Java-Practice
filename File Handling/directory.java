import java.io.File;
import java.util.Scanner;

public class directory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a directory path
        System.out.print("Enter the directory path: ");
        String path = scanner.nextLine();

        // Create a File object for the given path
        File directory = new File(path);

        // Check if the path is a valid directory
        if (directory.exists() && directory.isDirectory()) {
            // Get all files and directories inside the folder
            File[] filesList = directory.listFiles();

            System.out.println("\nFiles in " + path + ":\n");

            if (filesList != null && filesList.length > 0) {
                for (File file : filesList) {
                    if (file.isFile()) {
                        System.out.println("[File]     " + file.getName());
                    } else if (file.isDirectory()) {
                        System.out.println("[Directory] " + file.getName());
                    }
                }
            } else {
                System.out.println("The directory is empty.");
            }
        } else {
            System.out.println("Invalid directory path. Please try again.");
        }

        scanner.close();
    }
}
