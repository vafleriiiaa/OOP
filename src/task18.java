import java.util.Scanner;
import java.util.ArrayList;

public class task18 {
    static class Product {
        String name; double price;
        Product(String n, double p) { name = n; price = p; }
    }
    static class Order {
        ArrayList<Product> products = new ArrayList<>();
        void addProduct(Product p) { products.add(p); }
        double getTotal() {
            return products.stream().mapToDouble(p -> p.price).sum();
        }
    }
    public static void main(String[] args) {
        Order order = new Order();
        order.addProduct(new Product("Book", 10.0));
        order.addProduct(new Product("Pen", 2.5));
        System.out.println("Total: " + order.getTotal());
    }
}

