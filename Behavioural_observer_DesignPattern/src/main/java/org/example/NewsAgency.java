package org.example;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    public void addNews(String news){
        System.out.println("Today's Latest new "+news);
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        subscribers.forEach(ob -> ob.update());
    }
}
