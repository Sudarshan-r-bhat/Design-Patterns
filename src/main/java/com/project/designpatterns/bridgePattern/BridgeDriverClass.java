package com.project.designpatterns.bridgePattern;

public class BridgeDriverClass {
	public static void main(String[] args) {
		ImplementationLayer tv = new TV();
		RegularRemote remote = new RegularRemote(tv);
		
		String deviceInfo = remote.deviceInfo();
		System.out.println(deviceInfo);
		
		remote.channelUp();
		remote.increaseVolume();
		remote.increaseVolume();
		System.out.println(remote.deviceInfo());	
		
	}
}
