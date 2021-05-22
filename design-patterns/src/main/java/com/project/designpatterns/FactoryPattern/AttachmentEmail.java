package com.project.designpatterns.FactoryPattern;
// 3
public class AttachmentEmail extends EmailFactory {
	@Override
	public EmailType compose(String to, String from, String[] cc, String ... bcc) {
		return new AttachmentEmailType(to, from, cc, bcc);
	}

}
