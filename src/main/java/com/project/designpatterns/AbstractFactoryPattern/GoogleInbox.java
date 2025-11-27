package com.project.designpatterns.AbstractFactoryPattern;

public class GoogleInbox extends GoogleInboxService{

	@Override
	public InboxType checkInbox() {
		GoogleInboxType inbox = new GoogleInboxType();
		inbox.viewPrimary();
		inbox.viewSpam();
		return inbox;
	}

}
