package observerpattern.publisher;

import model.Meal;
import model.Order;
import model.OrderStatus;
import observerpattern.subscriber.OrderListener;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<OrderListener> listeners = new ArrayList<>();

    public void addListener(OrderListener listener) {
        if (listener == null) {
            return;
        }
        if (!listeners.contains(listener)) {
            listeners.add(listener);
        }
    }

    public void removeListener(OrderListener listener) {
        if (listener == null) {
            return;
        }
        listeners.remove(listener);
    }

    public Order createOrder(Meal meal) {
        if (meal == null) {
            throw new IllegalArgumentException("Meal cannot be null");
        }

        Order order = new Order(meal);
        notifyOrderCreated(order);
        return order;
    }

    public void updateStatus(Order order, OrderStatus status) {
        if (order == null || status == null) {
            throw new IllegalArgumentException("Order and status cannot be null");
        }

        order.setStatus(status);
        notifyOrderStatusChanged(order);
    }

    private void notifyOrderCreated(Order order) {
        List<OrderListener> listenersCopy = new ArrayList<>(listeners);
        for (OrderListener listener : listenersCopy) {
            listener.onOrderCreated(order);
        }
    }

    private void notifyOrderStatusChanged(Order order) {
        List<OrderListener> listenersCopy = new ArrayList<>(listeners);
        for (OrderListener listener : listenersCopy) {
            listener.onOrderStatusChanged(order);
        }
    }
    public List<OrderListener> getListeners() {
        return listeners;
    }
    public void setListeners(List<OrderListener> listeners) {
        this.listeners = listeners;
    }
}
