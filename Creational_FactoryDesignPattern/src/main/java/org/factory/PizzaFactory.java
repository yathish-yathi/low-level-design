package org.factory;

public class PizzaFactory {

    public Pizza preparePizza(String pizzaType){

        Pizza pizza = null;

        if(pizzaType.equals("cheese")){
            pizza = new CheesePizza();
        } else if(pizzaType.equals("mushroom")){
            pizza = new MushroomPizza();
        }else if(pizzaType.equals("plain")){
            pizza = new PlainPizza();
        }else{
            System.out.println("Please select available pizza");
        }

        return pizza;
    }

}
