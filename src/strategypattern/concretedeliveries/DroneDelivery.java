package strategypattern.concretedeliveries;

import strategypattern.delivery.DeliveryStrategy;

public class DroneDelivery implements DeliveryStrategy {

    @Override
    public void deliver(String orderId, String address) {
        System.out.println("Order " + orderId + " will be delivered by drone to: " + address);
    }
}
