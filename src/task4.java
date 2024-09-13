import java.util.Scanner;

public class task4 {
    abstract static class Transport { abstract void move(); }

    static class Car extends Transport { void move() { System.out.println("Car drives"); } }
    static class Bike extends Transport { void move() { System.out.println("Bike rides"); } }
    public static void main(String[] args) {
        Transport t1 = new Car(), t2 = new Bike();
        t1.move(); t2.move();
    }
}

