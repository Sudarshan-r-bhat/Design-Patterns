package com.project.designpatterns.Adapter;

public class ChargeDevice {
	public static void main(String[] args) throws InterruptedException {
		Electricity electricity = new Electricity("US", "160V", "0.5A", "80W", 50);
		Charger charger = new ChargerIn();
		charger.charge(electricity);
		
		System.out.println("-----------------------------------");
		Thread.sleep(3000);

		electricity = new Electricity("IN", "240V", "0.5A", "120W", 60);
		charger.charge(electricity);

		System.out.println("-----------------------------------");
		Thread.sleep(3000);

		charger = new UsChargerAdapter(new ChargerUS());
		electricity = new Electricity("US", "240V", "0.5A", "120W", 60);
		charger.charge(electricity);
	}
}
