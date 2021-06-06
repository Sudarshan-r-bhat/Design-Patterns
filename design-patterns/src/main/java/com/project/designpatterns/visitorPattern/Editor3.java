package com.project.designpatterns.visitorPattern;

public class Editor3 extends Editor {

	@Override
	public void acccept(Visitor visitor) {
		String visitorType = visitor.getClass().getSimpleName();
		System.out.println(visitorType);
		
		visitor.processEditor3();	
	}

}
