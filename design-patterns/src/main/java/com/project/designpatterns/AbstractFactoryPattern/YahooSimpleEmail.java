package com.project.designpatterns.AbstractFactoryPattern;

public class YahooSimpleEmail extends YahooEmailService {


	@Override
	public EmailType composeEmail(String to, String from, String[] cc, String... bcc) {
		// TODO Auto-generated method stub
		return new YahooSimpleEmailType(to, from, cc, bcc);
	}

}
