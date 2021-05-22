package com.project.designpatterns.AbstractFactoryPattern;

public class YahooInboxType implements InboxType {
	@Override
	public void viewPrimary() {
		System.out.println("YahooInbox: Currently You have 11 Unread e-mail");
	}

	@Override
	public void viewSpam() {
		System.out.println("YahooInbox: Currently You have 2 e-mails in Spam");
	}
}
