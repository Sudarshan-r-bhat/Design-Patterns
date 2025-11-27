package com.project.designpatterns.visitorPattern;

// ps: for a given list of editors and a visitor, extract all the export-able data from the editor nodes.

public class VisitorDriverClass {
	public static void main(String[] args) {
		
		Visitor v = new Visitor1();
		Editor[] editors = {new Editor1(), new Editor2(), new Editor3()};
		
		for(Editor e: editors) {
			e.acccept(v);
		}
	}
}
