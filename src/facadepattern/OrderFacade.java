package facadepattern;
import model.Meal;
import model.Order;
import model.OrderStatus;
import observerpattern.subscriber.OrderListener;
import observerpattern.publisher.OrderService;
import strategypattern.payment.PaymentStrategy;

public class OrderFacade {

    private OrderService orderService = new OrderService();

    public void addListener(OrderListener listener) {
        orderService.addListener(listener);
    }

    public Order createOrder(Meal meal) {
        return orderService.createOrder(meal);
    }

    public void payOrder(Order order, PaymentStrategy strategy) {
        strategy.pay(order.getMeal().getCost(), order.getId());
        orderService.updateStatus(order, OrderStatus.PAID);
    }

    public void startCooking(Order order) {
        orderService.updateStatus(order, OrderStatus.COOKING);
    }

    public void finishCooking(Order order) {
        orderService.updateStatus(order, OrderStatus.READY);
    }
}

