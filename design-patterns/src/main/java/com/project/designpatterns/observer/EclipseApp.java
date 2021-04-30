package com.project.designpatterns.observer;

// This is a Client class which triggers all the observers.
public class EclipseApp {
	
	public static void main(String[] args) {
		
		AnyUser springUsers = new SpringUsers();
		
		new UpdateMarketPlace(springUsers);
		Updates ui = new UpdateUI(springUsers);
		
		springUsers.sendUpdates(); // You can optionally send argument/s array
		
	}
}
