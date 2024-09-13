import java.util.Scanner;

public class task19 {
    static class Device {
        String brand;
        Device(String b) { brand = b; }
        void turnOn() { System.out.println(brand + " is on"); }
        void turnOff() { System.out.println(brand + " is off"); }
    }
    static class Smartphone extends Device {
        Smartphone(String b) { super(b); }
        void takePhoto() { System.out.println("Photo taken"); }
    }
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Apple");
        phone.turnOn();
        phone.takePhoto();
        phone.turnOff();
    }
}
