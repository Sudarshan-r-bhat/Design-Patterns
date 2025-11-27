package com.project.designpatterns.builderPattern;

import java.util.Arrays;

public class AttachmentEmailType extends EmailType{
	String to, from, body;
	String[] cc, bcc;
	Byte[][] attachments;

	public AttachmentEmailType(String to, String from, String[] cc, String[] bcc) {
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

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
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

	public Byte[][] getAttachments() {
		return attachments;
	}

	public void setAttachments(Byte[][] attachments) {
		this.attachments = attachments;
	}

	@Override
	public String toString() {
		return "AttachmentEmailType [to=" + to + ", from=" + from + ", body=" + body + ", cc=" + Arrays.toString(cc)
				+ ", bcc=" + Arrays.toString(bcc) + ", attachments=" + Arrays.toString(attachments) + "]";
	}
}
