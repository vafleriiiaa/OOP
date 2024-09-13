import java.util.Scanner;

public class task13 {
    static class UniqueID {
    static int counter = 0;
    int id;
    UniqueID() { id = ++counter; }
    int getID() { return id; }
}
    public static void main(String[] args) {
        UniqueID u1 = new UniqueID(), u2 = new UniqueID();
        System.out.println("ID 1: " + u1.getID() + ", ID 2: " + u2.getID());
    }
}

