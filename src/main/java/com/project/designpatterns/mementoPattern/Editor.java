package com.project.designpatterns.mementoPattern;

//This is the originator class.
public class Editor {
	private EditorState state;
	public Editor() {
		state = new EditorState("", 0, 1024);
	}
		
	public EditorState changeCords(int x, int y) {
		state.xCord = x;
		state.yCord = y;
		return createState();
	}
	
	public EditorState editText(final String text, final boolean append) {
		if(append) {
			state.text += text;
		} else {
			state.text = text;
		}
		return createState();
	}
	
	public String viewCurrentState() {
		System.out.println("EditorState [text=" + state.text + ", xCord=" + state.xCord + ", yCord=" + state.yCord + "]");
		return "EditorState [text=" + state.text + ", xCord=" + state.xCord + ", yCord=" + state.yCord + "]";
	}
	
	public String restore(EditorState oldState) {
		this.state = oldState;
		// If this was a real GUI, then this method 
		// would have set the Editor's text and cords.
		return "EditorState [text=" + this.state.text + ", xCord=" + this.state.xCord + ", yCord=" + this.state.yCord + "]";
	}
	
	private EditorState createState() {
		return new EditorState(state.text, state.xCord, state.yCord);
	}
	
	
	// This is the memento class.
	public class EditorState {
		private String text;
		private int xCord;
		private int yCord;
		
		EditorState(String text, int x, int y) {
			this.xCord = x; this.yCord = y; this.text = text;
		}
	}
}
