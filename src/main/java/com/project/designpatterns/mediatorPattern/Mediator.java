package com.project.designpatterns.mediatorPattern;

// Note: You can Make a Interface of Mediator. and Implement Different Mediators.
// For simplicity i will be using a Single Concrete Mediator class.
public class Mediator {
//	private PaymentComponent pc;
//	private AuthenticationComponent ac;
	
	public String notify(Component comp, String arg) {
		if(comp instanceof PaymentComponent) {
			return "Payment event triggered in the mediator";
		} else if(comp instanceof AuthenticationComponent) {
			return "Authentication process started";
		}
		return "Sorry, We did not recognize that input";
	}
}
