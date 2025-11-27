package com.project.designpatterns.chainOfResponsibility;

public abstract class EmailProcessor {

	EmailProcessor nextValidator;

	void setNextProcessor(EmailProcessor nextValidator) throws Exception {
		if (nextValidator != null) {
			System.out.println("validating and passing the request for next step of validation...");
			this.nextValidator = nextValidator;
		} else {
			throw new Exception("This is the end of the validators....");
		}
	}

	abstract boolean isValid(EmailUser userInfo) throws Exception;

}
