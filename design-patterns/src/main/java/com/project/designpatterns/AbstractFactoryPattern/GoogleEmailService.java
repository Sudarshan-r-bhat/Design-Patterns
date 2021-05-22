package com.project.designpatterns.AbstractFactoryPattern;

public abstract class GoogleEmailService extends GmailFactory {
	public abstract EmailType composeEmail(String to, String from, String[] cc, String ... bcc);
}
