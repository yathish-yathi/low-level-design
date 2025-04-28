package org.factory;

public class PizzaStore {

    public static void main(String[] args) {
        //inside pizza shop we need machine to bake required pizza
        PizzaFactory pizzaFactory = new PizzaFactory();
        //baking cheese pizza
        System.out.println("cheesePizza");
        Pizza order1 = pizzaFactory.preparePizza("cheese");
        order1.bake();
        order1.cut();
        order1.pack();

        System.out.println("mushroom");
        Pizza order2 = pizzaFactory.preparePizza("mushroom");
        order2.bake();
        order2.cut();
        order2.pack();

        System.out.println("plain");
        Pizza order3 = pizzaFactory.preparePizza("plain");
        order3.bake();
        order3.cut();
        order3.pack();
    }
}