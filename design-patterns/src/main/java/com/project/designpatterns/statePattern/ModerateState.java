package com.project.designpatterns.statePattern;

public class ModerateState implements State {
	private Document doc;
	@Override
	public void process(Document doc) {
		this.doc = doc;
		this.doc.text = "document is under levels of moderation.";
		System.out.println("Moderating the document...");
		setState();
	}
	public void setState() {
		doc.state = this;
	}
}
