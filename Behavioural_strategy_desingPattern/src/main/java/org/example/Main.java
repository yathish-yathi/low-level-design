package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        PaymentContext paymentContext = new PaymentContext(new CreditCardPaymentStrategy());
        paymentContext.payAmount(500.0);

        paymentContext.setPaymentStrategy(new PaypalPaymentStrategy());
        paymentContext.payAmount(300.0);

        paymentContext.setPaymentStrategy(new UPIPaymentStrategy());
        paymentContext.payAmount(100.0);
    }
}