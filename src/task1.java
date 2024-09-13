import java.util.Scanner;

public class task1 {
    static class Person {
        String name;
        int age;
        String gender;
        void showInfo() {
            System.out.println(name + ", " + age + " years old, " + gender);
        }
        void increaseAge() {
            age++;
        }
        void changeName(String newName) {
            name = newName;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Создание экземпляра класса Person
        Person person = new Person();
        // Ввод данных от пользователя
        System.out.print("Имя: ");
        person.name = scanner.nextLine();
        System.out.print("Возраст: ");
        person.age = scanner.nextInt();
        scanner.nextLine(); // Считывание оставшегося перевода строки
        System.out.print("Пол: ");
        person.gender = scanner.nextLine();
        // Вывод информации о человеке
        person.showInfo();
        // Увеличение возраста
        person.increaseAge();
        System.out.println("После увеличения возраста:");
        person.showInfo();
        // Изменение имени
        System.out.print("Новое имя: ");
        String newName = scanner.nextLine();
        person.changeName(newName);
        System.out.println("После изменения имя:");
        person.showInfo();
        scanner.close();
    }
}
