package org.example;

public class UPIPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(Double amount) {
        System.out.println("Paid "+amount+" using UPIPayment");
    }
}
