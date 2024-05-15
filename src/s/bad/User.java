package s.bad;

import java.math.BigDecimal;

public class User {
    private String name;
    private String surname;
    private int age;
    private String id;
    private BigDecimal amount;

    public void addUser(s.good.User user){
        System.out.println("User has been deleted");
    }
    public void deleteUser(s.good.User user){
        System.out.println("User has been deleted");
    }
    public void sendMoney(int amount){
        System.out.println("The amount was being sendt!");
    }
}
