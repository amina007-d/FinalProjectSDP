package observerpattern.concretesubscribers;

import model.Order;
import observerpattern.subscriber.OrderListener;

public class KitchenListener implements OrderListener {
    @Override
    public void onOrderCreated(Order order) {
        if (order == null) {
            return;
        }
        System.out.println("[Kitchen] New order created: " + order.getId());
    }

    @Override
    public void onOrderStatusChanged(Order order) {
        if (order == null) {
            return;
        }
        System.out.println("[Kitchen] Order " + order.getId() + " status: " + order.getStatus());
    }
}
