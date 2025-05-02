package org.example;

public interface Subject {
    public void addSubscriber(Observer observer);
    public void removeSubscriber(Observer observer);
    public void addNews(String news);
    public void notifyObservers();
}
