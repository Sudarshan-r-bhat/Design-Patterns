package com.project.designpatterns.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventManager {
	private Map<String, Set<AnyUser>> events;
	
	public EventManager() {
		events = new HashMap<>();
	}
	public void subscribe(AnyUser user, String eventType) {
		if(!events.containsKey(eventType)) {
			events.put(eventType, new HashSet<>());
		}
		events.get(eventType).add(user);
	}
	
	public void unSubscribe(AnyUser user, String eventType) {
		if(events.containsKey(eventType)) {
			Set<AnyUser> users = events.get(eventType);
			int idx = 0;
			users.removeIf(u -> u.equals(user));
		}
	}
	
	public void notify(String eventType, String data) {
		if(this.events.containsKey(eventType)) {
			events.get(eventType).forEach(user -> user.applyUpdates(data));
		}
	}
	
}
