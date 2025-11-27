package com.project.designpatterns.Adapter;

public class ChargerIndian extends Charger {
	
	private ChargerAdapter adapter;
	
	public ChargerIndian() {
		adapter = new ChargerAdapter();
	}
	@Override
	public void charge(Electricity electricity) {
		if(electricity.getCountry().equalsIgnoreCase("in")) {
			
			try {
				System.out.println("We have detected you're country's electricity Configuration as = " 
						+ electricity);
				Thread.sleep(1400);
				System.out.println("Preparing to charge....");
				Thread.sleep(2400);
				System.out.println("INDIAN standard charger: is juicing up your device!");
			} catch( Exception ex) {
				System.out.println("Charging failure!");
			}
			
		} else {
			adapter.charge(electricity);
		}
	}

}
