package com.project.designpatterns.FactoryPattern;

import java.util.Arrays;

// 5
public class SimpleEmailType implements EmailType {
	protected String to;
	protected String from;
	protected String[] cc;
	protected  String[] bcc;
	
	public SimpleEmailType(String to, String from, String[] cc, String ... bcc ) {
		this.to = to;
		this.from = from;
		this.cc = cc;
		this.bcc = bcc;
	}
	
	private String body;
	
	public String getTo() {
		return this.to;
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
		return "SimpleEmailType [to=" + to + ", from=" + from + ", cc=" + Arrays.toString(cc) + ", bcc="
				+ Arrays.toString(bcc) + ", body=" + body + "]";
	}
}
