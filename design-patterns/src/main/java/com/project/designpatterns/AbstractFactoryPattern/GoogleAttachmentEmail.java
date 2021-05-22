package com.project.designpatterns.AbstractFactoryPattern;

public class GoogleAttachmentEmail extends GoogleEmailService {

	@Override
	public EmailType composeEmail(String to, String from, String[] cc, String... bcc) {
		
		return new GoogleAttachmentEmailType(to, from, cc, bcc);
	}

}
