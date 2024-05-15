package d.good;

public class OnlineOrder implements OrderProcessor{
    @Override
    public void processOrder() {
        System.out.println("Online Order processor");
    }
}
