package org.example;

public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee DecoratedCoffee) {
        super(DecoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Sugar";
    }

    @Override
    public Double getCost() {
        System.out.println("SugarDecorator Coffee Price");
        return super.getCost() + 8;
    }
}
