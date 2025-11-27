package com.project.designpatterns.proxyPattern;

/*
problem stmt: Build a proxy firewall which will restrict the unknown users, 
	tap and modify the response from the actual service before handing over to the client
	like change the source IP address, and also mask / remove/ encrypt the sensitive information.

*/
public interface Firewall {
	public String getResource(String domain, String search);
	public boolean validateUser(String userJson);	
}
