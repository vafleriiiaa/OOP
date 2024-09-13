import java.util.Scanner;
import java.util.ArrayList;

public class task11 {
    static class Product {
        String name; double price; int quantity;
        Product(String n, double p, int q) { name = n; price = p; quantity = q; }
    }
    static class Store {
        ArrayList<Product> products = new ArrayList<>();
        void addProduct(Product p) { products.add(p); }
        void removeProduct(String name) { products.removeIf(p -> p.name.equals(name)); }
        Product findProductByName(String name) {
            for (Product p : products) if (p.name.equals(name)) return p;
            return null;
        }
    }
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("Apple", 1.0, 10));
        store.removeProduct("Apple");
    }
}
