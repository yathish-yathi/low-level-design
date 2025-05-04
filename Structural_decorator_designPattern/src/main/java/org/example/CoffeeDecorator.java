package org.example;

public abstract class CoffeeDecorator implements Coffee {

    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee DecoratedCoffee){
        this.decoratedCoffee=DecoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public Double getCost() {
        System.out.println("CoffeeDecorator Coffee Price");
        return decoratedCoffee.getCost();
    }
}
