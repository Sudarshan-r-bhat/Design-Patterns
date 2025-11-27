package com.project.designpatterns.proxyPattern;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirewallService implements Firewall {
	private List<String> legitUsers = new ArrayList<>() {
		{
			add("sudarshan");
			add("lily");
			add("zoya");
			add("pavan");
		}
	};
	private static final Map<String, String> RESOURCES = new LinkedHashMap<>() {
		{
			put("google", "https://8.8.8.8/search?q=");
			put("yahoo", "https://1.1.1.1/home/");
			
		}
	};
	
	@Override
	public String getResource(String domain, String search) {
		String s = RESOURCES.get(domain);
		System.out.println("fetching resources from appropriate IP .... please wait " + s + search);
		String res = "<h2> Requested resource/s are unavailable </h2>";
		return res;
	}

	@Override
	public boolean validateUser(String user) {
		return legitUsers.contains(user.toLowerCase());
	}

}
