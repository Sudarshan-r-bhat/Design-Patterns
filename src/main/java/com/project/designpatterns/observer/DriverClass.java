package com.project.designpatterns.observer;

public class DriverClass {
	public static void main(String[] args) {
		
		EclipseServer server = new EclipseServer();
		server.getEvents().subscribe(new SpringUser1("#0011"), "ui-update");
		server.getEvents().subscribe(new SpringUser2("#0002"), "security");
		server.getEvents().subscribe(new SpringUser1("#0011"), "security");
		
		server.uiUpdate("roger blue");
		server.securityUpdate("<xmlns:designPatterns.project.com><security></security>");
		server.uiUpdate("dark solarized");
		
	}
}
