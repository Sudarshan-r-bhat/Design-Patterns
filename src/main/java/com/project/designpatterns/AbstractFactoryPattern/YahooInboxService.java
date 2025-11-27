package com.project.designpatterns.AbstractFactoryPattern;

public abstract class YahooInboxService extends YahooFactory {
	public abstract InboxType checkInbox();
}
