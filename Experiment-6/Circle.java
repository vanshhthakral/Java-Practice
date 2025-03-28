class Circle extends MathConstants {
    void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + ": " + area);
    }
}
