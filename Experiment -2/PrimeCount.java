public class PrimeCount {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; i <= 1000; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.println("Total prime numbers between 10 and 1000 : " + count);
    }

    static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
