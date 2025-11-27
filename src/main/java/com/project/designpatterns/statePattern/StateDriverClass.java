package com.project.designpatterns.statePattern;

public class StateDriverClass {

	public static void main(String[] args) {
		
		Document doc = new Document();
		doc.text = "raw data";
		State currentStateOfDocument = null;
		
		System.out.println(doc.text);
		
		draft(doc);
		System.out.println(doc.text);
		
		moderate(doc);
		System.out.println(doc.text);
		
		publish(doc);
		System.out.println(doc.text);
	}

	public static void draft(Document doc) {
		if (doc.state == null) {
			new DraftState().process(doc);
		} else {
			System.out.println(doc.state.getClass().getSimpleName());
		}
	}

	public static void moderate(Document doc) {
		if (doc.state.getClass().getSimpleName().equalsIgnoreCase("DraftState")) {
			new ModerateState().process(doc);
		} else {
			System.out.println(doc.state.getClass().getSimpleName());
		}
	}

	public static void publish(Document doc) {
		if (doc.state.getClass().getSimpleName().equalsIgnoreCase("ModerateState")) {
			new PublishState().process(doc);
		} else {
			System.out.println(doc.state.getClass().getSimpleName());
		}
	}

}
