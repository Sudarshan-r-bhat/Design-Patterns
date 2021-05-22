package com.project.designpatterns.decoratorPattern;

// This class is a very smart way of coding. To reduce coding complexity
//  and to wrap the object in the right order.
public class DataSourceDecorator implements DataSource {
	
	private DataSource wrappee;
	public DataSourceDecorator (DataSource source) {
		wrappee = source;
	}
	
	@Override
	public void writeData(String data) {
		wrappee.writeData(data);		
	}

	@Override
	public String readData() {
		return wrappee.readData();
	}

}
