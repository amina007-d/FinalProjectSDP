package strategypattern.concretepayment;

import strategypattern.payment.PaymentStrategy;

public class CardPayment implements PaymentStrategy {

    @Override
    public void pay(float amount, String orderId) {
        System.out.println("Order " + orderId + " paid " + amount + " using Credit/Debit Card.");
    }
}
