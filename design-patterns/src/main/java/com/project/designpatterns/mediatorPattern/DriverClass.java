package com.project.designpatterns.mediatorPattern;


public class DriverClass {
	public static void main(String[] args) {
		Mediator m = new Mediator();
		PaymentComponent c = new PaymentComponent(m);
		
		String response = c.makePayment("{name: 'sudarshan', password: '123', amount: 1500, to: 'bhat.org'}");
		System.out.println(response);
	}
}
