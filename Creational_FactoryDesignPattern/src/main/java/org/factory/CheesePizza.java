package org.factory;

public class CheesePizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking the cheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the cheesePizza");
    }

    @Override
    public void pack() {
        System.out.println("Packing the cheesePizza");
    }
}
