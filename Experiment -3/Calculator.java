class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(4, 11));
        System.out.println("Sum of 2 doubles: " + calc.add(7.5, 11.5));
        System.out.println("Sum of 3 integers: " + calc.add(7, 13, 25));
    }
}
