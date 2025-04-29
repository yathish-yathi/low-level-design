package org.example;

public class Main {
    public static void main(String[] args) {

        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        System.out.println(singletonInstance1 == singletonInstance1); //true

    }
}