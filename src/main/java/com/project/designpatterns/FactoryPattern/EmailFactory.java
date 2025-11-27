package com.project.designpatterns.FactoryPattern;
// 1
public abstract class EmailFactory {
	public abstract EmailType compose(String to, String from, String[] cc, String ... bcc);
}
