import java.util.Scanner;

public class task3 {
    interface Animal { void makeSound(); }

    static class Dog implements Animal { public void makeSound() { System.out.println("Woof"); } }
    static class Cat implements Animal { public void makeSound() { System.out.println("Meow"); } }
    static class Cow implements Animal { public void makeSound() { System.out.println("Moo"); } }
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Cow() };
        for (Animal a : animals) a.makeSound();
    }
}

