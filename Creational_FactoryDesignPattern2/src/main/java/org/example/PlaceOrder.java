package org.example;

public class PlaceOrder {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Factory object
        FurnitureFactory factory = new FurnitureFactory();

        Table table = factory.createModernStyleTable();
        table.create();

        Chair chair = factory.createOldStyleChair();
        chair.create();
    }
}