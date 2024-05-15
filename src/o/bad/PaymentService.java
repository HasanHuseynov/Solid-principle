package o.bad;

public class PaymentService {
    public void initialPayment(int amount, String paymentName){
        if(paymentName.equals("credit")){
            System.out.println("Proceeding the credit payment");
        } else if (paymentName.equals("paypal")) {
            System.out.println("Proceeding the paypal payment");
        }
    }
}
