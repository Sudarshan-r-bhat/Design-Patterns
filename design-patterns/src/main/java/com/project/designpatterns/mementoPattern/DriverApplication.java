package com.project.designpatterns.mementoPattern;

import com.project.designpatterns.mementoPattern.Editor.EditorState;

public class DriverApplication {
	private StateHistory careTaker;
	private Editor originator;
	private EditorState memento;
	
	/********************************************************************************+
	 |	Here you can use command pattern to change the state of the editor. which	 |
	 |	would intern create a new State/Memento.									 |
	 +*******************************************************************************+*/
	// but instead, you are providing a method to alter the states.
	public static void main(String[] args) {
		DriverApplication app = new DriverApplication();
		app.originator = new Editor();
		app.careTaker = new StateHistory(app.originator);
		
		app.originator.viewCurrentState();
		
		app.memento = app.originator.editText("This is the first state change", true);
		app.careTaker.addState(app.memento);
		
		app.originator.viewCurrentState();
		
		app.careTaker.restore();
		app.memento = app.originator.editText("This is the second state change", false);
		
		app.careTaker.addState(app.memento);
		
		app.memento = app.originator.editText("This is the Thrid state change", false);
		
		app.originator.viewCurrentState();
		app.careTaker.restore();
		app.careTaker.restore();
		app.originator.viewCurrentState();
	}

	
}
