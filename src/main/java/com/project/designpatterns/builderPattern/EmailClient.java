package com.project.designpatterns.builderPattern;

/*
ps:
	Build a Email client, which follows builder pattern, to send 
	default Email to a predefined set of email recipients.

dnc:
	Builder pattern:
		Builder Interface <- concrete builders with methods.
			concrete Director class which will call builder methods 
			to make a proper build.
*/
public class EmailClient {
	
	public static void main(String[] args) {
		EmailCreator mailer = new EmailCreator(new SimpleEmailBuilder());
		mailer.sendDefaultEmails();
		mailer.sendDefaultAttachmentEmails();
		
		System.out.println("==========================================\n\n");
		mailer = new EmailCreator(new AttachmentEmailBuilder());
		mailer.sendDefaultEmails();
		mailer.sendDefaultAttachmentEmails();
	}
}
