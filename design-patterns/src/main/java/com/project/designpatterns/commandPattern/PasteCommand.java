package com.project.designpatterns.commandPattern;

public class PasteCommand extends Command {
	public PasteCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public void execute() {
		String selection = this.editor.getSelection();
		this.saveBackup(selection);
		String clipboard = this.app.getClipboard();
		this.editor.replaceSelection(clipboard);
		System.out.println("paste cmd success !");
	}
}
