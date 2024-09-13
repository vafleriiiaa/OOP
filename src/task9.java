import java.util.Scanner;

public class task9 {
    static class Animal { void move() { System.out.println("Animal moves"); } }
    static class Fish extends Animal { void move() { System.out.println("Fish swims"); } }
    static class Bird extends Animal { void move() { System.out.println("Bird flies"); } }
    static class Dog extends Animal { void move() { System.out.println("Dog runs"); } }
    public static void main(String[] args) {
        Animal[] animals = { new Fish(), new Bird(), new Dog() };
        for (Animal a : animals) a.move();
    }
}
