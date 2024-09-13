import java.util.Scanner;
import java.util.ArrayList;

public class task5 {
    static class Book { String title, author; int year;
    Book(String t, String a, int y) { title = t; author = a; year = y; }
}
    static class Library {
        ArrayList<Book> books = new ArrayList<>();
        void addBook(Book b) { books.add(b); }
        void searchByAuthor(String author) {
            for (Book b : books) if (b.author.equals(author)) System.out.println(b.title);
        }
    }
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Book2", "Author1", 2000));
        lib.searchByAuthor("Author1");
    }
}

