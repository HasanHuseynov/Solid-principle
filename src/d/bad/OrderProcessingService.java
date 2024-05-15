package d.bad;

public class OrderProcessingService {
    private final OnlineOrder onlineOrder;
    private final OfflineOrder offlineOrder;

    public OrderProcessingService(OnlineOrder onlineOrder, OfflineOrder offlineOrder) {
        this.onlineOrder = onlineOrder;
        this.offlineOrder = offlineOrder;
    }

    public void processOfflineOrder(){
        offlineOrder.processOrder();
    }
    public void processOnlineOrder(){
        onlineOrder.processOrder();
    }
}
