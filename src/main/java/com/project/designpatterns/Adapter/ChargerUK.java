package com.project.designpatterns.Adapter;

public class ChargerUK implements OtherChargers {
	
	public void charge(Electricity electricity) {
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
	}
	@Override
	public void fastCharge() {
		
		
	}

}
