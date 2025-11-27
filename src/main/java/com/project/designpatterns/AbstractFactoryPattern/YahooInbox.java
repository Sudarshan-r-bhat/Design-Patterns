package com.project.designpatterns.AbstractFactoryPattern;

public class YahooInbox extends YahooInboxService {

	@Override
	public InboxType checkInbox() {
		YahooInboxType inbox = new YahooInboxType();
		inbox.viewPrimary();
		inbox.viewSpam();
		return inbox;
	}

}
