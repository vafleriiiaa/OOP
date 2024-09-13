import java.util.Scanner;

public class task15 {
    static class ComplexNumber {
        double real, imaginary;

        ComplexNumber(double r, double i) { real = r; imaginary = i; }
        ComplexNumber add(ComplexNumber c) {
            return new ComplexNumber(real + c.real, imaginary + c.imaginary);
        }
        void print() {
            System.out.println(real + " + " + imaginary + "i");
        }
    }
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(1, 2), c2 = new ComplexNumber(3, 4);
        c1.add(c2).print();
    }
}
