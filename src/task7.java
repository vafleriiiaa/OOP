import java.util.Scanner;

public class task7 {
    static class Counter {
        static int count = 0;
        Counter() { count++; }
        static int getCount() { return count; }
    }
    public static void main(String[] args) {
        new Counter();
        new Counter();
        System.out.println("Total objects: " + Counter.getCount());
    }
}
