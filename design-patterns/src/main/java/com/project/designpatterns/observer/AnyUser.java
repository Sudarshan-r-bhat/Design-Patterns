package com.project.designpatterns.observer;

import java.util.HashSet;
import java.util.Set;

// This is a Subject class
public abstract class AnyUser {
	
	// This the list of observers.
	protected final Set<Updates> updates = new HashSet<>();
	
	// This is internally attach observers to the Subject.
	public void attach(Updates update) {
		updates.add(update);
	}
	public abstract void sendUpdates(Object... args);
}
