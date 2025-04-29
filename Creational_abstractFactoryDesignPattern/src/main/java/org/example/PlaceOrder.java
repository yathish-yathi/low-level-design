package org.example;

public class PlaceOrder {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //old style Factory (factory 1)
        FurnitureFactory oldStylefactory = new OldStyleFurnitureFactory();

        Table table_old = oldStylefactory.createTable();
        table_old.create();

        Chair chair_old = oldStylefactory.createChair();
        chair_old.create();

        //Modern style factory (factory 2)
        FurnitureFactory modernStylefactory = new ModernStyleFurnitureFactory();

        Table table_modern = modernStylefactory.createTable();
        table_modern.create();

        Chair chair_modern = modernStylefactory.createChair();
        chair_modern.create();
    }
}