package com.project.designpatterns.statePattern;

// Remember this is a behaviour pattern: 
// its an interface to bring out a functionality. it will refer to the next state.
// but, it should not store the next state. 
public interface State {
	public abstract void process(Document doc);
	public abstract void setState();
}
