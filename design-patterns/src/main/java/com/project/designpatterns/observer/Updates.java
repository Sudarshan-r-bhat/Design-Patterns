package com.project.designpatterns.observer;

// This is the abstract Observer class
public abstract class Updates {
	
	protected AnyUser user;
	public abstract void applyUpdate(Object...args);
}
