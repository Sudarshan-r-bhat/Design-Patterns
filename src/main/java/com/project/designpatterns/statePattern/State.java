package com.project.designpatterns.statePattern;

// Remember this is a behaviour pattern: 
// its an interface to bring out a functionality. it will refer to the next state.
// but, it should not store the next state. 
public interface State {
	public abstract void draft(Document doc);
	public abstract void moderate(Document doc);
	public abstract void publish(Document doc);
}
