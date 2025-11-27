package com.project.designpatterns.proxyPattern;

public class FirewallProxyService implements Firewall {
	
	private final FirewallService oService = new FirewallService();
	
	@Override
	public String getResource(String domain, String search) {
		String result = oService.getResource(domain, search);
		// do some more operation here...
		return result;
	}

	@Override
	public boolean validateUser(String userJson) {
		
		// Intercepting and Logging the request.
		String user = userJson.substring(userJson.indexOf(":") + 3, userJson.length() - 2);
		System.out.println(user);
		if(oService.validateUser(user)) {
			System.out.println("User validation success!");
			return true;
		}
		System.out.println("User validation failed!");
		return false;
	}

}
