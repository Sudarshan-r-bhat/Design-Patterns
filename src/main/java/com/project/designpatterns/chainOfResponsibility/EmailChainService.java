package com.project.designpatterns.chainOfResponsibility;

public class EmailChainService {

	private EmailChianCreator chainCreator = new EmailChianCreator();
	private boolean valid = false;

	public boolean validateUser(EmailUser user ) {

		try {

			EmailProcessor chain = chainCreator.getChains();
			valid = chain.isValid(user);

		} catch (Exception e) {
			e.printStackTrace();
			return valid;
		}

		return valid;
	}
}
