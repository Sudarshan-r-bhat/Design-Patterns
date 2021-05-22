package com.project.designpatterns.Adapter;

public class ChargerAdapter extends Charger {

	@Override
	public void charge(Electricity electricity) {
		String country = electricity.getCountry();
		switch(country) {
			case "US": 
				new ChargerUS().charge(electricity);
				break;
			case "UK":
				new ChargerUK().charge(electricity);
				break;
			case "SA":
				new ChargerSA().charge(electricity);
				break;	
			default: 
				System.out.println("Sorry we only support US, UK, SA, IN standard chargers");
				
		}

	}

}
