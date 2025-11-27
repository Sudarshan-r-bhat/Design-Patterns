package com.project.designpatterns.decoratorPattern;

public interface DataSource {
	public void writeData(String data);
	public String readData();
}
