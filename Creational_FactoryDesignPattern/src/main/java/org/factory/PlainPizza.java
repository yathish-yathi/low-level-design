package org.factory;

public class PlainPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking the PlainPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the PlainPizza");
    }

    @Override
    public void pack() {
        System.out.println("Packing the PlainPizza");
    }
}
