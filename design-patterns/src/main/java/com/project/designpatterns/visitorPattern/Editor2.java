package com.project.designpatterns.visitorPattern;

public class Editor2 extends Editor {

	@Override
	public void acccept(Visitor visitor) {
		String visitorType = visitor.getClass().getSimpleName();
		System.out.println(visitorType);
		
		visitor.processEditor2("{text: System.out.println(\"this is a test\");, lineLimit = 290chars}");		
	}

}
