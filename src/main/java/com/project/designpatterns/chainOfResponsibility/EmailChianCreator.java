package com.project.designpatterns.chainOfResponsibility;

public class EmailChianCreator {

	private EmailProcessorChain1 emailValidator;
	private EmailProcessorChain2 passwordValidator;
	private EmailProcessorChain3 finalStep;

	public EmailChianCreator() {
		this.emailValidator = new EmailProcessorChain1();
		this.passwordValidator = new EmailProcessorChain2();
		this.finalStep = new EmailProcessorChain3();
	}

	EmailProcessor getChains() throws Exception {

		EmailProcessor chain1 = emailValidator;
		EmailProcessor chain2 = passwordValidator;
		EmailProcessor chain3 = finalStep;

		// adding this verbosity for better readability

		chain1.setNextProcessor(chain2);
		chain2.setNextProcessor(chain3);
		chain3.setNextProcessor(null);

		return chain1;
	}
}
