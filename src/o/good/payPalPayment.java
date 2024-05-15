package o.good;

public class payPalPayment implements PaymentProcessor {
    @Override
    public void proceedPayment(int amount) {
        System.out.println(amount+"amount has been proceeded in PayPal");
    }
}
