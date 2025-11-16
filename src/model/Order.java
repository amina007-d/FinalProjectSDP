package model;

public class Order {

    private final String id;
    private Meal meal;
    private OrderStatus status;
    private static int counter = 1;

    public Order(Meal meal) {
        this.id = String.format("ORD-%03d", counter++);
        this.meal = meal;
        this.status = OrderStatus.CREATED;
    }

    public String getId() { return id; }
    public Meal getMeal() { return meal; }
    public OrderStatus getStatus() { return status; }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
