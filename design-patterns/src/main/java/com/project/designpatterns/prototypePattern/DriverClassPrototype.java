package com.project.designpatterns.prototypePattern;

public class DriverClassPrototype {
	
	public static void main(String[] args) {
		PrototypeRegistry registry = new PrototypeRegistry();
		try {
			Tiger tiger = (Tiger) registry.get("tiger");
			System.out.println(tiger);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
