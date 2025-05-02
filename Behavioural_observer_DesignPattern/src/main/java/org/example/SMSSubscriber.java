package org.example;

public class SMSSubscriber implements Observer{
    String name;

    public SMSSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println("Hi "+name +" Please find SMS news update");
    }
}
