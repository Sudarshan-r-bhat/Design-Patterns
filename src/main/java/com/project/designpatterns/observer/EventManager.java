package com.project.designpatterns.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventManager {
    private Map<String, Set<Observer>> eventSubscribers;
    
    public EventManager() {
        this.eventSubscribers = new HashMap<>();
    }
    
    public void subscribe(Observer observer, String eventType) {
        eventSubscribers.computeIfAbsent(eventType, k -> new HashSet<>()).add(observer);
        System.out.println("Subscribed: " + observer.getUserId() + " to " + eventType);
    }
    
    public void unsubscribe(Observer observer, String eventType) {
        Set<Observer> observers = eventSubscribers.get(eventType);
        if (observers != null) {
            observers.remove(observer);
            System.out.println("Unsubscribed: " + observer.getUserId() + " from " + eventType);
        }
    }
    
    public void notify(String eventType, String data) {
        Set<Observer> observers = eventSubscribers.get(eventType);
        if (observers != null && !observers.isEmpty()) {
            System.out.println("\n--- Notifying " + observers.size() + 
                             " subscriber(s) for event: " + eventType + " ---");
            observers.forEach(observer -> observer.update(eventType, data));
        }
    }
}
