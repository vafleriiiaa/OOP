import java.util.ArrayList;
import java.util.Scanner;

public class task10 {
    static class Student {
        String name; String group; double grade;
        Student(String n, String g, double gr) { name = n; group = g; grade = gr; }
    }
    static class University {
        ArrayList<Student> students = new ArrayList<>();
        void addStudent(Student s) { students.add(s); }
        void sortByName() { students.sort((s1, s2) -> s1.name.compareTo(s2.name)); }
        void filterByGrade(double minGrade) {
            for (Student s : students) if (s.grade >= minGrade) System.out.println(s.name);
        }
    }
    public static void main(String[] args) {
        University uni = new University();
        uni.addStudent(new Student("Alice", "CS101", 4.5));
        uni.addStudent(new Student("Bob", "CS102", 3.8));
        uni.sortByName();
        uni.filterByGrade(4.0);
    }
}
