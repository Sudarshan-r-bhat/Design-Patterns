package com.project.designpatterns.mementoPattern;

import java.util.Stack;

import com.project.designpatterns.mementoPattern.Editor.EditorState;

// This is the Caretaker class.
public class StateHistory {
	
	private Editor originator;
	private Stack<EditorState> memento = new Stack<>();
	
	public StateHistory(Editor e) {
		this.originator = e;
		this.memento.add(originator.new EditorState("", 0, 1024));
	}
	public void addState(EditorState mem) {
		memento.push(mem);
	}
	
	public String restore() {
		EditorState mem = memento.pop();
		return this.originator.restore(mem);
	}
}
