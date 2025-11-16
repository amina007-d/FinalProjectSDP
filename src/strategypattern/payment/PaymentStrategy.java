package strategypattern.payment;

public interface PaymentStrategy {
    void pay(float amount, String orderId);
}

