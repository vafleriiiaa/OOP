import java.util.Scanner;

public class task8 {
    abstract static class Shape { abstract double getArea(); }
    static class Circle extends Shape {
        double radius;
        Circle(double r) { radius = r; }
        double getArea() { return Math.PI * radius * radius; }
    }
    static class Rectangle extends Shape {
        double width, height;
        Rectangle(double w, double h) { width = w; height = h; }
        double getArea() { return width * height; }
    }
    public static void main(String[] args) {
        Shape c = new Circle(5), r = new Rectangle(4, 5);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Rectangle area: " + r.getArea());
    }
}
