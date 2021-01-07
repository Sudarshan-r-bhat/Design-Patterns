package com.project.designpatterns.chainOfResponsibility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailChainService {
	
	@Autowired
	private EmailChianCreator chainCreator;
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
