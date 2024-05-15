package o.good;

public class creditCardPayment implements PaymentProcessor {

    @Override
    public void proceedPayment(int amount) {
        System.out.println(amount+"has been proceeded!");
    }
}
