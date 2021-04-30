package com.project.designpatterns.observer;

public class UpdateUI extends Updates {

	public UpdateUI() {
		
	}

	public UpdateUI(AnyUser user) {
		user.attach(this);
	}
	
	@Override
	public void applyUpdate(Object...args) {
		System.out.println("Adding a new Dark Theme");
		
	}

}
