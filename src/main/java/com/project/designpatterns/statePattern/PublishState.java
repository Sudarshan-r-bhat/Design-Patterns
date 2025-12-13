package com.project.designpatterns.statePattern;

public class PublishState implements State {
	
	@Override
	public void draft(Document doc) {
		System.out.println("Cannot go back to draft from published state.");
	}
	
	@Override
	public void moderate(Document doc) {
		System.out.println("Cannot go back to moderate from published state.");
	}
	
	@Override
	public void publish(Document doc) {
		doc.setText("document is published");
		System.out.println("Publishing the document...");
	}
}
