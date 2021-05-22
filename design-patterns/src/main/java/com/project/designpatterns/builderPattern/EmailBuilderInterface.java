package com.project.designpatterns.builderPattern;

public interface EmailBuilderInterface {
	public void setEmailHeaders(String to, String from, String[] cc, String ...bcc);
	public void setBody(String body);
	public EmailType build();
}
