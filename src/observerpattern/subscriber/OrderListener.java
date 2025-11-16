package observerpattern.subscriber;

import model.Order;

public interface OrderListener {
    void onOrderCreated(Order order);
    void onOrderStatusChanged(Order order);
}

