package com.project.designpatterns.statePattern;

public class Document {
	private State state;
	private String text = "";
	
	// Getters and Setters
	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	// State transition methods - delegate to current state
	public void draft() {
		if (state == null) {
			// Initial transition to draft state
			state = new DraftState();
			state.draft(this);
		} else {
			state.draft(this);
		}
	}
	
	public void moderate() {
		if (state != null) {
			state.moderate(this);
		} else {
			System.out.println("Document has no state. Please draft it first.");
		}
	}
	
	public void publish() {
		if (state != null) {
			state.publish(this);
		} else {
			System.out.println("Document has no state. Please draft it first.");
		}
	}
	
	// Display current state
	public void render() {
		if (state != null) {
			System.out.println("Current state: " + state.getClass().getSimpleName());
		} else {
			System.out.println("Current state: No state");
		}
	}
}
