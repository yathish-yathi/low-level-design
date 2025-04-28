package org.factory;

public class MushroomPizza implements Pizza {
    @Override
    public void bake() {
        System.out.println("Baking the MushroomPizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the MushroomPizza");
    }

    @Override
    public void pack() {
        System.out.println("Packing the MushroomPizza");
    }
}
