package observerpattern.concretesubscribers;

import model.Order;
import observerpattern.subscriber.OrderListener;

public class CustomerListener implements OrderListener {
    @Override
    public void onOrderCreated(Order order) {
        if (order == null) {
            return;
        }
        System.out.println("[Customer] Order accepted! ID: " + order.getId());
    }

    @Override
    public void onOrderStatusChanged(Order order) {
        if (order == null) {
            return;
        }
        System.out.println("[Customer] Your order is now: " + order.getStatus());
    }
}
