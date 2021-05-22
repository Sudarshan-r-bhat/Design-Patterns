package com.project.designpatterns.AbstractFactoryPattern;

import java.util.Arrays;

public class GoogleAttachmentEmailType implements EmailType {
	private String to; 
	private String from;
	private String[] cc; 
	private String[] bcc;
	private String body;
	private Byte[][] attachments;
	

	public GoogleAttachmentEmailType(String to, String from, String[] cc, String[] bcc) {
		super();
		this.to = to;
		this.from = from;
		this.cc = cc;
		this.bcc = bcc;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String[] getCc() {
		return cc;
	}

	public void setCc(String[] cc) {
		this.cc = cc;
	}

	public String[] getBcc() {
		return bcc;
	}

	public void setBcc(String[] bcc) {
		this.bcc = bcc;
	}

	public String getBody() {
		return body;
	}

	@Override
	public void setBody(String body) {
		this.body = body;
	}

	public Byte[][] getAttachments() {
		return attachments;
	}

	public void setAttachments(Byte[][] attachments) {
		this.attachments = attachments;
	}

	@Override
	public String toString() {
		return "GoogleAttachmentEmailType [to=" + to + ", from=" + from + ", cc=" + Arrays.toString(cc) + ", bcc="
				+ Arrays.toString(bcc) + ", body=" + body + ", attachments=" + Arrays.toString(attachments) + "]";
	}


}
