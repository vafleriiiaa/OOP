import java.util.Scanner;

public class task6 {
    static class BankAccount {
        private String accountNumber;
        private double balance;
        BankAccount(String acc, double bal) { accountNumber = acc; balance = bal; }
        void deposit(double amount) { balance += amount; }
        void withdraw(double amount) { if (balance >= amount) balance -= amount; }

        double getBalance() { return balance; }
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 1000);
        acc.deposit(500); acc.withdraw(300);
        System.out.println("Balance: " + acc.getBalance());
    }
}

