import java.util.Scanner;

public class task2 {
    static class Person {
        String name; int age; String gender;
        Person(String n, int a, String g) { name = n; age = a; gender = g; }
    }
    static class Worker extends Person {
        int salary;
        Worker(String n, int a, String g, int s) { super(n, a, g); salary = s; }
    }
    static class Manager extends Worker {
        int subordinates;
        Manager(String n, int a, String g, int s, int sub) { super(n, a, g, s); subordinates = sub; }
    }
    public static void main(String[] args) {
        Manager m = new Manager("Аня", 21, "Женский", 5000, 5);
        System.out.println("Менеджер: " + m.name + ", Подчиненные: " + m.subordinates);
    }
}
