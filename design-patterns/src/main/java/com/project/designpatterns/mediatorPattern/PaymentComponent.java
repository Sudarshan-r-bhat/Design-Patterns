package com.project.designpatterns.mediatorPattern;

public class PaymentComponent extends Component {
	
	PaymentComponent(Mediator m) {
		super(m);
	}

	public String makePayment(String paymentDetails) {
		return this.mediator.notify(this, paymentDetails);
	}
}
