package com.project.designpatterns.commandPattern;

public class CopyCommand extends Command{
	public CopyCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public void execute() {
		
		String selection = this.editor.getSelection();
		this.saveBackup(selection);
		this.app.setClipboard(selection);
		System.out.println("Copy to clipboard suceess!");
	}
}
