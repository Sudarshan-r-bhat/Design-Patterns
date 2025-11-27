package com.project.designpatterns.builderPattern;

import java.util.List;

public class EmailCreator {
	private EmailBuilderInterface builder;
	
	public EmailCreator(EmailBuilderInterface builder) {
		this.builder = builder;
	}
	public void sendDefaultEmails() {
		String body = "Hi, THis is  the Default email being sent";
		String from = "sudarshan.bhat@brillio.com";
		
		List<String> to = List.of("xyz@gmail.com", "abc@yahoo.com", "abyz@live.com");
		to.stream().map(t -> {
			builder.setEmailHeaders(t, from, null, null);
			builder.setBody(body);
			return builder.build();
		}).forEach(System.out::println);
	}
	
	public void sendDefaultAttachmentEmails() {
		String body = "Hi, THis is  the Default Attachment email being sent";
		String from = "sudarshan.bhat@brillio.com";
		
		List<String> to = List.of("xyz@gmail.com", "abc@yahoo.com", "abyz@live.com");
		to.stream().map(t -> {
			builder.setEmailHeaders(t, from, null, null);
			builder.setBody(body);
			// System.out.println(builder.getClass().getSimpleName());
			if(builder.getClass().getSimpleName().contains("AttachmentEmail")) {
				System.out.println("attaching images and pdf's");
				((AttachmentEmailBuilder)builder).setAttachments(null);
			}
		
			return builder.build();
		}).forEach(System.out::println);
		
		
	}
}
