package com.project.designpatterns.proxyPattern;

public class ProxyDriverClass {
	public static void main(String[] args) {
		
		// Here you are currently not providing any option to change the service
		// the implementation has only 1 service for simplicity.
		String userJson = "{ \"user\" : \"sudarshan\"}";
		Firewall f = new FirewallProxyService();
		f.validateUser(userJson);
		String response = f.getResource("google", "youtube");
		System.out.println(response);
	}
}
