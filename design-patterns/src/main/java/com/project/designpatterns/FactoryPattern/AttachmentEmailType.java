package com.project.designpatterns.FactoryPattern;

import java.io.IOException;
import java.util.Arrays;
// 6
public class AttachmentEmailType implements EmailType {
	
	protected String to;
	protected String from;
	protected String[] cc;
	protected  String[] bcc;
	
	private Byte[][] attachments;
	private String body;
	
	public AttachmentEmailType(String to, String from, String[] cc, String ... bcc ) {
		this.to = to;
		this.from = from;
		this.cc = cc;
		this.bcc = bcc;
	}
	
	public void setAttachment(Byte[] ... attachments) {
		this.attachments = attachments;
	}
	public Byte[][] getAttachment() throws IOException {
		return attachments;
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
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public EmailType edit() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public String toString() {
		return "AttachmentEmailType [to=" + to + ", from=" + from + ", cc=" + Arrays.toString(cc) + ", bcc="
				+ Arrays.toString(bcc) + ", attachments=" + Arrays.toString(attachments) + ", body=" + body + "]";
	}
	
}
