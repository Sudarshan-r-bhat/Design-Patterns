package com.project.designpatterns.commandPattern;


// currently, you will be getting and setting the entire text 
// when running the corresponding methods.
// This class is like a State which changes based on the commands.
public class Editor {
	
	private String text = "Default text here";
	
	public String getSelection() {
		return text;
	}
	public void deleteSelection() {
		text = "";
	}
	public String replaceSelection(String replaceStr) {
		text = replaceStr;
		return text;
	}
}
