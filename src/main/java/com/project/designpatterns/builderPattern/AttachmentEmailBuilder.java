package com.project.designpatterns.builderPattern;

public class AttachmentEmailBuilder implements EmailBuilderInterface {
	private AttachmentEmailType email;
	
	@Override
	public void setEmailHeaders(String to, String from, String[] cc, String... bcc) {
		email = new AttachmentEmailType(to, from, cc, bcc);
	}

	@Override
	public void setBody(String body) {
		if(email != null ) {
			email.setBody(body);
		} else {
			email = new AttachmentEmailType(null, null, null, null);
			email.setBody(body);
		}
	}
	
	public void setAttachments(Byte[][] attachments) {
		email.setAttachments(attachments);
	}
	public AttachmentEmailType build() {
		return email;
	}

}
