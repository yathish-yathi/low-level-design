package org.example;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public Double getCost() {
        System.out.println("Simple Coffee Price");
        return 10.0;
    }
}
