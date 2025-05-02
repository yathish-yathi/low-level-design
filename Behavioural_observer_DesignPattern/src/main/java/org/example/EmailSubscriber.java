package org.example;

public class EmailSubscriber implements Observer {

    String name;

    public EmailSubscriber(String name){
        this.name=name;
    }

    @Override
    public void update() {
        System.out.println("Hi "+name +" Please find Email news update");
    }
}
