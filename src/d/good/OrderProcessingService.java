package d.good;

public class OrderProcessingService {
    private final OrderProcessor orderProcessor;

    public OrderProcessingService(OrderProcessor orderProcessor) {
        this.orderProcessor = orderProcessor;
    }
    public void setOrderProcessor(){
        orderProcessor.processOrder();
    }
}
