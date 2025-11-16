package strategypattern.delivery;

public interface DeliveryStrategy {
    void deliver(String orderId, String address);
}