package com.project.designpatterns.AbstractFactoryPattern;

import java.util.Arrays;

public class YahooSimpleEmailType implements EmailType {
	private String to; 
	private String from;
	private String[] cc; 
	private String[] bcc;
	private String body;
	
	public YahooSimpleEmailType(String to, String from, String[] cc, String[] bcc) {
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

	@Override
	public String toString() {
		return "YahooSimpleEmailType [to=" + to + ", from=" + from + ", cc=" + Arrays.toString(cc) + ", bcc="
				+ Arrays.toString(bcc) + ", body=" + body + "]";
	}

}
