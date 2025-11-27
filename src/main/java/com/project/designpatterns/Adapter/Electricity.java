package com.project.designpatterns.Adapter;

public class Electricity {
	private String country;
	private String voltage;
	private String current;
	private String power;
	private Integer frequency;
	
	public Electricity() {
		this("", "", "", "", 0);
	}
	public Electricity(String country, String voltage, String current, String power, Integer frequency) {
		this.frequency = frequency;
		this.country = country;
		this.voltage = voltage;
		this.current = current;
		this.power = power;
	}
	
	
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getVoltage() {
		return voltage;
	}
	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}
	public String getCurrent() {
		return current;
	}
	public void setCurrent(String current) {
		this.current = current;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Electricity [country=" + country + ", voltage=" + voltage + ", current=" + current + ", power=" + power
				+ ", frequency=" + frequency + "]";
	}
	
	
	
}
