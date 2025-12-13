package com.project.designpatterns.observer;

public class JavaUser extends AbstractUser {

    public JavaUser(String userId) {
        super(userId);
    }
    
    @Override
    protected void applyUpdates(String updateData) {
        System.out.println("  → JavaUser processing: " + updateData);
        // Java-specific update logic here
    }
}
