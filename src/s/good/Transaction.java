package s.good;

import java.math.BigDecimal;

public class Transaction {
    private String id;
    private BigDecimal amount;

    public void sendMoney(int amount){
        System.out.println("The amount was being sendt!");
    }
}
