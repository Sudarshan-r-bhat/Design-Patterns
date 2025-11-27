package com.project.designpatterns.observer;

// This is a Client class which triggers all the observers.
/*
 * refer: https://refactoring.guru/design-patterns/observer
 * Note: This pattern is not implemented properly.
 * 
	
how it is currently:
	. a Subscriber(users) are maintaining the list of updates to be applied.
	. subscriber is attaching updates Listeners, through update listeners. LOL XD!!
	. subscriber is acting like producer by apply all updates.
	. there is no producer who is producing any updates to be received by the subscribers.
	
How it should be:
	
	. Subscriber should define the operation to be performed upon receiving updates. 
	
	. You need a Producer that contains reference to EventManager.
	
	. EventManager: who maintains a record of Subscribers and Type of event to 
	 which subscribers have subscribed for and sends updates to them accordingly.
	
	. Event Managers have 3 functionalities to addNew subscriber, remove an existing subscriber, notify subscribers 
	 based on events for which subscribers have subscribed for.
	
	. Producers produce events of different types.

	
	Note: 
		4 things are involved here: 
			1. subscriber [applyUpdate()]
			2. producer [ produce()..[event1, event2, ...] ]
			3. events
			4. eventManager [subscribe(), unSubscribe(), notify()]
			
	> SO, you need to have a list of users who are subscribed to different Kind of updates/events.
	> also you need a list of 'Updates' of different kind.
	> You need a producer who will generate these updates.
	> A event manager who notifies the appropriate List of users to the specific updates/events they are
	subscribed to.

*/
public class EclipseServer {
	
	
	private EventManager events;
	
	public EclipseServer() {
		events = new EventManager();
	}
	
	public void uiUpdate(String color) {
		String updateData = "{type: theme, color:" + color;
		events.notify("ui-update", updateData);
	}
	
	public void securityUpdate(String xmlFile) {
		events.notify("security", xmlFile);
	}

	public EventManager getEvents() {
		return this.events;
	}
	
}
