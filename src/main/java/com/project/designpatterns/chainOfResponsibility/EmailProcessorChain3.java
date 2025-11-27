package com.project.designpatterns.chainOfResponsibility;

import org.springframework.stereotype.Component;

@Component("finalChain")
public class EmailProcessorChain3 extends EmailProcessor {

	@Override
	boolean isValid(EmailUser userInfo) throws Exception {
		
		boolean valid = true;
		
		try {
			// make a db criteria and store the details to the database.
			

		} catch (Exception e) {
			valid = false;
			
			
		}
		
		try {
			// make a request to EmailService client to send the request....
			
			
		} catch (Exception e) {
			valid = false;
		}
		
		
		return valid;
	}
	
	
	

}
