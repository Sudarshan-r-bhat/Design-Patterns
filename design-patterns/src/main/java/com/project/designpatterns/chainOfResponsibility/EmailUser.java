package com.project.designpatterns.chainOfResponsibility;


public class EmailUser {
	
	private String emailId;
	private String password;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "EmailUser [emailId=" + emailId + ", password=" + password + "]";
	}
	
	
	
//	@Email
//	private String emailId;
//	
//	@Max(value = 15)
//	@Min( value = 8)
//	private String password;

}
