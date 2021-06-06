package com.project.designpatterns.statePattern;

public class DraftState implements State {
	private Document doc;
	@Override
	public void process(Document doc) {
		this.doc = doc;
		this.doc.text = "document is under continuous development now.";
		System.out.println("Drafting the document...");
		setState();
	}
	public void setState() {
		doc.state = this;
	}
}
