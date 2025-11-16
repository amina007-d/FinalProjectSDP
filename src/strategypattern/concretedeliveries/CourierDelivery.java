package strategypattern.concretedeliveries;

import strategypattern.delivery.DeliveryStrategy;

public class CourierDelivery implements DeliveryStrategy {

    @Override
    public void deliver(String orderId, String address) {
        System.out.println("Order " + orderId + " will be delivered by courier to: " + address);
    }
}
