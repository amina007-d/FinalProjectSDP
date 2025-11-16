package strategypattern.concretedeliveries;

import strategypattern.delivery.DeliveryStrategy;

public class PickupDelivery implements DeliveryStrategy {

    @Override
    public void deliver(String orderId, String address) {
        System.out.println("Order " + orderId + " is ready for pickup at: " + address);
    }
}
