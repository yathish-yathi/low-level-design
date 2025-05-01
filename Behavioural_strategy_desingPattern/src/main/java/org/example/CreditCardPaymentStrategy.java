package org.example;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(Double amount) {
        System.out.println("Paid "+amount+" using CreditCard Payment");
    }
}
