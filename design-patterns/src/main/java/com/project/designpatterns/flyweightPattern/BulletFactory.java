package com.project.designpatterns.flyweightPattern;

import java.util.HashMap;
import java.util.Map;

class BulletFactory {
	private final static Map<String, BulletType> bulletTypes = new HashMap<>();
	public static BulletType getBullet(String name, String color, String dimension) {
		BulletType bt = bulletTypes.get(name);
		// TODO: create bits based on the color of the bullet.
		if(bt== null) {
			switch(name) {
			case "45pc":
				// golden
				bt = new BulletType(name, new Byte[10], dimension, 10);
				break;
			case "7mm":
				// titanium
				bt = new BulletType(name, new Byte[10], dimension, 10);
				break;
			case "9mm":
				// copper.
				
			default: 
				if(bulletTypes.get("9mm") != null) {
					System.out.println(name + " this bullet is unavailable hence default is 9mm ");
					return bulletTypes.get("9mm");
				}
					bt =  new BulletType("9mm", new Byte[10], dimension, 10);
			}
			bulletTypes.put(name, bt);
		}
		return bt;
	}
}
