package com.project.designpatterns.AbstractFactoryPattern;

import org.apache.tomcat.jni.Time;

/*
ps:
	implement 2 Email clients which have the functionality of Inbox-viewing and compose-send email. 
dnc:	
	EmailFactory  ->
		GmailFactory, YahooFactory
			SimpleMail, AttachmentMail        SimpleMail, AttachmentMail
			Inbox							  Inbox
			
			<Email interface> 					  
			<Inbox interface> 
*/
public class EmailClient {
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println(time - time);
		String to = "sudarshan.bhat@brillio.com", from = "sudarshanrbhat.srb2@gmail.com";
		String[] cc = null, bcc = null;
		
		GoogleEmailService googleMailer = new GoogleSimpleEmail();
		EmailType googleEmail = googleMailer.composeEmail(to, from, cc, bcc);
		googleEmail.setBody("Hi, Sending this from GoogleEmailService");
		sendMail(googleEmail);
		
		GoogleInboxService gInbox = new GoogleInbox();
		gInbox.checkInbox();
	
// -------------------------------------------------------------------------------------------------------		
		System.out.println("\n\n\n=================================================");
// -------------------------------------------------------------------------------------------------------		
		String to2 = "sudarshan.bhat@brillio.com", from2 = "sudarshanrbhat@yahoo.com";
		String[] cc2 = null, bcc2 = null;
		
		YahooEmailService yahooMailer = new YahooSimpleEmail();
		EmailType yahooMail = yahooMailer.composeEmail(to2, from2, cc2, bcc2);
		yahooMail.setBody("Hi, sending this from YahooEmailService");
		sendMail(yahooMail);
		
		YahooInboxService yInbox = new YahooInbox();
		yInbox.checkInbox();
		
		System.out.println("\nTotal Execution Time in Milli Seconds = " + (System.currentTimeMillis() - time));
	}
	
	public static <T> void sendMail(T mail) {
		System.out.println(mail);
	}
}
