package com.project.designpatterns.observer;

// This is an extension to Subject class
public class SpringUsers extends AnyUser {
	
	// the below method is optional
	public void addNewUpdateFeature(Updates update) {
		updates.add(update);
	}
	
	@Override
	public void sendUpdates(Object... args) {
		System.out.println("Sending Updates ... ");
		updates.stream().forEach(u -> u.applyUpdate(args));
	}

}
