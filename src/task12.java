import java.util.Scanner;

public class task12 {
    interface PaymentSystem { void pay(); void refund(); }
    static class CreditCard implements PaymentSystem {
        public void pay() { System.out.println("Paid by CreditCard"); }
        public void refund() { System.out.println("Refund by CreditCard"); }
    }
    static class PayPal implements PaymentSystem {
        public void pay() { System.out.println("Paid by PayPal"); }
        public void refund() { System.out.println("Refund by PayPal"); }
    }
    public static void main(String[] args) {
        PaymentSystem cc = new CreditCard(), pp = new PayPal();
        cc.pay(); pp.refund();
    }
}

