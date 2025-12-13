package com.project.designpatterns.statePattern;

public class ModerateState implements State {
	
	@Override
	public void draft(Document doc) {
		System.out.println("Cannot go back to draft from moderate state.");
	}
	
	@Override
	public void moderate(Document doc) {
		doc.setText("document is under levels of moderation.");
		System.out.println("Moderating the document...");
	}
	
	@Override
	public void publish(Document doc) {
		doc.setState(new PublishState());
		doc.publish();
	}
}
