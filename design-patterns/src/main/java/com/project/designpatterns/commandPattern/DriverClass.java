package com.project.designpatterns.commandPattern;

public class DriverClass {
	public static void main(String[] args) {
		Application app = new Application();
		Editor editor = new Editor();
		
		EditCommand editCmd = new EditCommand(app, editor);
		editCmd.editText("Edited text", true);
		app.execute(editCmd);
		
		System.out.println("After edit command\n " + editor.getSelection());
		
		app.execute(new CopyCommand(app, editor));
		System.out.println("After undo command ");
		app.undo();
		
	}
}
