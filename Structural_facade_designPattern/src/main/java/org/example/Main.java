package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        HomeTheaterFacade theater = new HomeTheaterFacade();
        theater.watchMovie("Inception");
        theater.endMovie();
    }
}