package com.project.designpatterns.commandPattern;

public abstract class Command {
	public Application app;
	public Editor editor;
	private String backupText;
	
	public Command(Application app, Editor editor) {
		this.app = app; this.editor = editor; 
	}
	
	public abstract void execute();
	
	public void saveBackup(String backup) {
		this.backupText = backup;
	}
	
	public String undo() {
		return backupText;
	}
}
