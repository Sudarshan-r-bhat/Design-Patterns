package com.project.designpatterns.FactoryPattern;
// 2
public class SimpleEmail extends EmailFactory {
	@Override
	public EmailType compose(String to, String from, String[] cc, String ... bcc) {
		return new SimpleEmailType(to, from, cc, bcc);
	}
}
