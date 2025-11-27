package com.project.designpatterns.AbstractFactoryPattern;

public abstract class YahooEmailService extends YahooFactory {
	public abstract EmailType composeEmail(String to, String from, String[] cc, String ... bcc);
}
