package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Computer computer1 = new Computer.Builder("intel i9",12)
                .hasSsd(true)
                .hasGraphicsCard(true)
                .build();
        computer1.printDetails();

        Computer computer2 = new Computer.Builder("Ryzen 9",16).build();
        computer2.printDetails();
    }
}