package com.project.designpatterns.chainOfResponsibility;

public class EmailProcessorChain1 extends EmailProcessor {

	@Override
	boolean isValid(EmailUser user) throws Exception {

		System.out.println("validating the user's email address.....");
		String email = user.getEmailId();
		boolean valid = email.matches("[a-z._0-9]+@[(gmail.com)]*[(yahoo.com)]*");

		if (valid)
			try {
				System.out.println("Email address is valid and now validating the password.....");
				if (this.nextValidator != null) {
					this.nextValidator.isValid(user);
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		else {
			System.out.println("Invalid Email id");
			throw new Exception("Invalid email address");
		}

		return valid;
	}

}
