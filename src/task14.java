import java.util.Scanner;

public class task14 {
    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
    }
    static class Rectangle {
        Point topLeft, bottomRight;
        Rectangle(Point tl, Point br) { topLeft = tl; bottomRight = br; }

        int getArea() {
            return (bottomRight.x - topLeft.x) * (topLeft.y - bottomRight.y);
        }
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(new Point(0, 5), new Point(5, 0));
        System.out.println("Area: " + rect.getArea());
    }
}
