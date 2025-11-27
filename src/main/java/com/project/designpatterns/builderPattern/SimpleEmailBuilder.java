package com.project.designpatterns.builderPattern;

public class SimpleEmailBuilder implements EmailBuilderInterface {

	private SimpleEmailType email;
	@Override
	public void setEmailHeaders(String to, String from, String[] cc, String... bcc) {
		email = new SimpleEmailType(to, from, cc, bcc);
	}

	@Override
	public void setBody(String body) {
		if(email !=null) email.setBody(body);
		else {
			email = new SimpleEmailType(null, null, null, null);
			email.setBody(body);
		}
	}
	
	public SimpleEmailType build() {
		return this.email;
	}

}
