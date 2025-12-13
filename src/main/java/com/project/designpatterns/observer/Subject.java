package com.project.designpatterns.observer;

public interface Subject {
    void subscribe(Observer observer, String eventType);
    void unsubscribe(Observer observer, String eventType);
    void notifyObservers(String eventType, String data);
}
