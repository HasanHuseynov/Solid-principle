package d.good;

public class OfflineOrder implements OrderProcessor{
    @Override
    public void processOrder() {
        System.out.println("Offline order processor");
    }
}
