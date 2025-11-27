package com.project.designpatterns.AbstractFactoryPattern;

public class GoogleSimpleEmail extends GoogleEmailService {

	
	@Override
	public EmailType composeEmail(String to, String from, String[] cc, String... bcc) {
		// TODO Auto-generated method stub
		return new GoogleSimpleEmailType(to, from, cc, bcc);
	}
	
}
