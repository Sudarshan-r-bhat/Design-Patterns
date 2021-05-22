/*
ps:
	using Factory pattern build a email class which will be capable of composing 
	1. simple Email 2. Advanced email with attachment
dnc:
	both will have One common product in the factory pattern -- lets say Email.
	compose() method should be able to generate a EmailFactory Object type.
	send() method should be able to send the email to appropriate host.
	
*/
package com.project.designpatterns.FactoryPattern;

public class EmailClient {
	public static void main(String[] args) {
		
		String to = "sudarshan.bhat@brillio.com", from = "sudarshanrbhat.srb2@gmail.com";
		String[] cc = null, bcc = null;
		
		EmailFactory am = new AttachmentEmail();
		EmailType email = am.compose(to, from, cc, bcc);
		email.setBody("Hi, This is testing");
		((AttachmentEmailType)email).setAttachment(null);
		
		sendMail(email);
	}
	public static void sendMail(EmailType email) {
		System.out.println(email);
	}
	

	
	
}
