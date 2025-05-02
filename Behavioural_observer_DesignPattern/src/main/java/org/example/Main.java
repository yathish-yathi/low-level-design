package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        NewsAgency newsAgency = new NewsAgency();

        //Customers
        Observer ob1 = new EmailSubscriber("John");
        Observer ob2 = new EmailSubscriber("John");
        Observer ob3 = new SMSSubscriber("jockey");
        Observer ob4 = new SMSSubscriber("rocky");

        newsAgency.addSubscriber(ob1);
        newsAgency.addSubscriber(ob2);
        newsAgency.addSubscriber(ob3);
        newsAgency.addSubscriber(ob4);

        newsAgency.addNews("\"Neraj Chopra won gold medal\"");
    }
}