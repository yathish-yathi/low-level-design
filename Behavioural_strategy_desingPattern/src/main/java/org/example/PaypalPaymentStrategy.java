package org.example;

public class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(Double amount) {
        System.out.println("Paid "+amount+" using PayPal Payment");
    }
}
