package com.project.designpatterns.statePattern;

public class StateDriverClass {

	public static void main(String[] args) {
		
		Document doc = new Document();
		doc.setText("raw data");
		
		System.out.println(doc.getText());
		
		doc.draft();
		System.out.println(doc.getText());
		
		doc.moderate();
		System.out.println(doc.getText());
		
		doc.publish();
		System.out.println(doc.getText());
	}

}
