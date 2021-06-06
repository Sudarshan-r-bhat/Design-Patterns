package com.project.designpatterns.commandPattern;

public class EditCommand extends Command {

	private String edit;
	
	public EditCommand(Application app, Editor editor) {
		super(app, editor);
	}

	@Override
	public void execute() {
		if(edit != null) {
			String selection = this.editor.getSelection();
			this.saveBackup(selection);
			this.editor.replaceSelection(edit);
		} else {
			throw new IllegalStateException("EnterText to edit !");
		}
	}
	public void editText(String text, boolean append) {
		if(append == true) {
			edit = this.editor.getSelection() + " " + text;
		} else {
			edit = text;
		}
	}
	
}
