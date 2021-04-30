package com.project.designpatterns.observer;

public class UpdateMarketPlace extends Updates{

	public UpdateMarketPlace() {
	}
	
	public UpdateMarketPlace(AnyUser user) {
		user.attach(this);
	}
	
	
	@Override
	public void applyUpdate(Object... args) {
		System.out.println("JDK new versions are made available here!");
		
	}

}
