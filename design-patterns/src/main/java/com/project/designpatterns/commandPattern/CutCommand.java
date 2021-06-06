package com.project.designpatterns.commandPattern;

public class CutCommand extends Command {
	public CutCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public void execute() {
		String selection = this.editor.getSelection();
		this.saveBackup(selection);
		this.editor.deleteSelection();
		this.app.setClipboard(selection);
		System.out.println("Cut cmd success, clipboard updated and selected text in the editor is CUT .");
	}
}
