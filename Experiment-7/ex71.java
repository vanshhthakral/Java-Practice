abstract class ShapeDemo {
    abstract void calculateArea();
    }
    class Rectangle extends ShapeDemo {
    private double length, width;
    public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
    }
    @Override
    void calculateArea() {
    double area = length * width;
    System.out.println("Area of Rectangle: " + area);
    }
    }
    class Circle extends ShapeDemo {
    private double radius;
    public Circle(double radius) {
    this.radius = radius;
    }
    @Override
    void calculateArea() {
    double area = Math.PI * radius * radius;
    System.out.println("Area of Circle: " + area);
    }
    }
    public class ex71 {
    public static void main(String[] args) {
    ShapeDemo rectangle = new Rectangle(10, 20);
    rectangle.calculateArea();
    ShapeDemo circle = new Circle(5);
    circle.calculateArea();
    }
    }