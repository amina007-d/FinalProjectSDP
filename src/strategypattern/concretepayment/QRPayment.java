package strategypattern.concretepayment;

import strategypattern.payment.PaymentStrategy;

public class QRPayment implements PaymentStrategy {
    @Override
    public void pay(float amount, String orderId) {
        System.out.println("Order " + orderId + " paid " + amount + " via QR");
    }
}
