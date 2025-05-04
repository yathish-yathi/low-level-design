package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

        System.out.println("=============");

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());

        System.out.println("=============");

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.getCost());
    }
}