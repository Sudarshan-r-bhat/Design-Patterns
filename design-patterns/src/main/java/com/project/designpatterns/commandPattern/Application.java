package com.project.designpatterns.commandPattern;

import java.util.LinkedList;
import java.util.Queue;

// This is the sender class
public class Application {
	
	private final int N = 5;
	private Editor[] editors = new Editor[N];
	private String clipboard = "";
	private Queue<Command> commandHistory = new LinkedList<>();
	private Editor currentEditor;
	
	
	public void execute(Command cmd) {
		cmd.execute();
		commandHistory.offer(cmd);
	}
	public Command undo() {
		Command cmd =  commandHistory.poll();
		System.out.println(cmd.undo());
		return cmd;
	}
	
	public void setClipboard(String c) {
		clipboard = c;
	}
	public String getClipboard() {
		return clipboard;
	}

	
}
