import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 3, 3, 6, 7, 3}; // Example array

        System.out.print("Enter the number to count: ");
        int target = sc.nextInt();
        int count = 0;

        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }

        System.out.println(target + " appears " + count + " times.");
        sc.close();
    }
}
