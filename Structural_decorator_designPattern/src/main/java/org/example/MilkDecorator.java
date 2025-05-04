package org.example;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee DecoratedCoffee) {
        super(DecoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Milk";
    }

    @Override
    public Double getCost() {
        System.out.println("MilkDecorator Coffee Price");
        return super.getCost() + 6;
    }
}
