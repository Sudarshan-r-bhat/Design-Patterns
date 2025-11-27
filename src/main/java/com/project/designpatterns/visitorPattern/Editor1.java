package com.project.designpatterns.visitorPattern;

public class Editor1 extends Editor {

	@Override
	public void acccept(Visitor visitor) {
		
		String visitorType = visitor.getClass().getSimpleName();
		System.out.println(visitorType);
		
		visitor.processEditor1("{text: hello world, lineLimit = 400chars}");
		
		
	}

}
