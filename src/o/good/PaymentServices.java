package o.good;

public class PaymentServices {
    private PaymentProcessor paymentProcessor;

    public void initialPayment(int amount){
        paymentProcessor.proceedPayment(amount);
    }
}
