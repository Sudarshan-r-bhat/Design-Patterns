package com.project.designpatterns.statePattern;

public class PublishState implements State {
	private Document doc;
	@Override
	public void process(Document doc) {
		this.doc = doc;
		this.doc.text = "document is published";
		System.out.println("Publishing the document...");
		setState();
	}
	public void setState() {
		doc.state = this;
	}

}
