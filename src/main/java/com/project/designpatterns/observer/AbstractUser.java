package com.project.designpatterns.observer;

import java.util.Objects;

public abstract class AbstractUser implements Observer {
    
    private final String userId;
    
    public AbstractUser(String userId) {
        this.userId = userId;
    }
    
    @Override
    public String getUserId() {
        return userId;
    }
    
    @Override
    public void update(String eventType, String data) {
        System.out.println("[" + this.getClass().getSimpleName() + " - " + userId + "] " +
                         "Received " + eventType + ": " + data);
        applyUpdates(data);
    }
    
    protected void applyUpdates(String updateData) {
        System.out.println("Applying updates: " + updateData);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof AbstractUser)) return false;
        AbstractUser other = (AbstractUser) obj;
        return Objects.equals(userId, other.userId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
