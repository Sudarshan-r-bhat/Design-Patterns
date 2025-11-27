package com.project.designpatterns.chainOfResponsibility;

public class ValidateUserController {

	EmailChainService emailChainService = new EmailChainService();

	public boolean validateUser(EmailUser user ) {

		boolean valid = emailChainService.validateUser(user);

		return valid;
	}

}
