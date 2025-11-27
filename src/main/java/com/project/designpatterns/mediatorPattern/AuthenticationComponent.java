package com.project.designpatterns.mediatorPattern;

public class AuthenticationComponent extends Component {
	
	AuthenticationComponent(Mediator m) {
		super(m);
	}

	public String authenticate(String details) {
		return this.mediator.notify(this, details);
	}
}
