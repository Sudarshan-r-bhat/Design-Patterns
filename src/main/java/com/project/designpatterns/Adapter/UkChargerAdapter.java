package com.project.designpatterns.Adapter;

public class UkChargerAdapter implements Charger {
    private ChargerUK chargerUK;
    public UkChargerAdapter(ChargerUK chargerUK) {
        this.chargerUK = chargerUK;
    }

    @Override
    public void charge(Electricity electricity) {
        stabilizeElectricity(electricity);
        chargerUK.fastCharge(electricity);
    }
    private void stabilizeElectricity(Electricity electricity) {
        electricity.setVoltage("230V");
        electricity.setCountry("uk");
        electricity.setFrequency(50);
        System.out.println("we are now fast charging for UK standards: " + electricity);
    }
}
