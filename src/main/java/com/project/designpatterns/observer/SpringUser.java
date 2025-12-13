package com.project.designpatterns.observer;

public class SpringUser extends AbstractUser {

    public SpringUser(String userId) {
        super(userId);
    }
    
    @Override
    protected void applyUpdates(String updateData) {
        System.out.println("  → SpringUser processing: " + updateData);
        // Spring-specific update logic here
    }
}
