package com.project.designpatterns.chainOfResponsibility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("emailProcessor")
public abstract class EmailProcessor {
	
	final static Logger log = LoggerFactory.getLogger(EmailProcessor.class);
	
	@Autowired
	@Qualifier("emailProcessor")
	EmailProcessor nextValidator;
	
	void setNextProcessor(EmailProcessor nextValidator) throws Exception {
		if(nextValidator != null ) {
			
			log.info("validating and passing the request for next step of validation...");
			this.nextValidator = nextValidator;
		}
		else {
			throw new Exception("This is the end of the validators....");
		}
	}
	
	abstract boolean isValid(EmailUser userInfo) throws Exception;

}
