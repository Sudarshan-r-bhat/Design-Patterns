package com.project.designpatterns.observer;

public interface Observer {
    void update(String eventType, String data);
    String getUserId();
}
