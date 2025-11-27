package com.project.designpatterns.observer;

public abstract class AnyUser {
	
	private String userId;
	public AnyUser(String id) {
		this.userId = id;
	}
	
	public void applyUpdates(String updateData) {
		System.out.println("Applying " + updateData + " for " + this.getClass().getSimpleName());
	}

	@Override
	public boolean equals(Object obj) {
		
		AnyUser otherUser = obj instanceof AnyUser? (AnyUser) obj: null;
		boolean isEqual = otherUser.userId.equals(this.userId);
		
		return otherUser != null ? isEqual: false;
	}
	
	
	
	
}
