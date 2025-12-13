package com.project.designpatterns.statePattern;

public class DraftState implements State {
	
	@Override
	public void draft(Document doc) {
		doc.setText("document is under continuous development now.");
		System.out.println("Drafting the document...");
	}
	
	@Override
	public void moderate(Document doc) {
		doc.setState(new ModerateState());
		doc.moderate();
	}
	
	@Override
	public void publish(Document doc) {
		System.out.println("Cannot publish directly from draft state. Please moderate first.");
	}
}
