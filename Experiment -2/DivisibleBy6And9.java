public class DivisibleBy6And9 {
    public static void main(String[] args) {
        for (int i = 10; i <= 950; i++) {
            if (i % 6 == 0 && i % 9 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
