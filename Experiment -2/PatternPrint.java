public class PatternPrint {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < (2 * i - 1); j++) {
                if (i % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("?");
                }
            }
            System.out.println();
        }
    }
}
