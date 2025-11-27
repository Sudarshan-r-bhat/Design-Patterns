package com.project.designpatterns.Adapter;

public class ChargerUK {
	
	public void fastCharge(Electricity electricity) {
		if(electricity.getCountry().equalsIgnoreCase("uk")) {
			try {
				System.out.println("We have detected you're country's electricity Configuration as = " 
						+ electricity);
				Thread.sleep(1400);
				System.out.println("Preparing to charge....");
				Thread.sleep(2400);
				System.out.println("Juicing Up you're device!");
			} catch( Exception ex) {
				System.out.println("Charging failure!");
			}
		} else
			System.out.println("Invalid charger for your country. Please use Charger Adapter");
	}
}
