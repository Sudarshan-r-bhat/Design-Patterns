package com.project.designpatterns.Adapter;

public class UsChargerAdapter implements Charger {
	private ChargerUS chargerUS;
	public UsChargerAdapter(ChargerUS chargerUS) {
		this.chargerUS = chargerUS;
	}

	@Override
	public void charge(Electricity electricity) {
		stabilizeElectricity(electricity);
		chargerUS.fastCharge(electricity);
	}
	private void stabilizeElectricity(Electricity electricity) {
		electricity.setVoltage("110V");
		electricity.setCountry("us");
		electricity.setFrequency(60);
		System.out.println("we are now fast charging for US standards: " + electricity);
	}
}
