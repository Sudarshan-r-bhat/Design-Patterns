package com.project.designpatterns.AbstractFactoryPattern;

public class GoogleInboxType implements InboxType {

	@Override
	public void viewPrimary() {
		System.out.println("GoogleInbox: Currently You have 1 Unread e-mail");
		
	}

	@Override
	public void viewSpam() {
		System.out.println("GoogleInbox: Currently You have NO mails in Spam");
		
	}

}
