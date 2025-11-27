package com.project.designpatterns.chainOfResponsibility;

public class EmailProcessorChain2 extends EmailProcessor {

	@Override
	boolean isValid(EmailUser user) throws Exception {

		String password = user.getPassword();
		boolean lengthConstraint = password.length() > 8 && password.length() < 15;
		boolean valid = password.matches("[\\w*@\\+]+");

		if (lengthConstraint && valid)
			try {
				System.out.println("password is valid and now storing the user info to DB and sending email confirmation.");
				if (this.nextValidator != null) {
					this.nextValidator.isValid(user);
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		else {
			System.out.println("Invalid password");
			throw new Exception("Invalid email address");
		}


		return (lengthConstraint && valid);
	}
}
