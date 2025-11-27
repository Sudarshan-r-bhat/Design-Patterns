package com.project.designpatterns.mediatorPattern;

public abstract class Component {
	public Mediator mediator;
	Component(Mediator m) {
		this.mediator = m;
	}
	
}
