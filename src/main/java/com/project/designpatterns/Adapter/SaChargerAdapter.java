package com.project.designpatterns.Adapter;

public class SaChargerAdapter implements Charger {
    private ChargerSA chargerSA;
    public SaChargerAdapter(ChargerSA chargerSA) {
        this.chargerSA = chargerSA;
    }

    @Override
    public void charge(Electricity electricity) {
        stabilizeElectricity(electricity);
        chargerSA.fastCharge(electricity);
    }
    private void stabilizeElectricity(Electricity electricity) {
        electricity.setVoltage("230V");
        electricity.setCountry("sa");
        electricity.setFrequency(60);
        System.out.println("we are now fast charging for SA standards: " + electricity);
    }
    
}
