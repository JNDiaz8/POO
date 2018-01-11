package com.iesvirgendelcarmen.poo.ejercicios;

public class Car {
	private double fuelAmount = 5;
	private double consumption = 7;
	
	public double getFuelAmount() {
		return fuelAmount;
	}
	
	public void setFuelAmount(double fuelAmount) {
		this.fuelAmount = fuelAmount;
	}
	
	public double getConsumption() {
		return consumption;
	}
	
	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}
	
	public void addFuel (double fuel) {
		fuelAmount += fuel;
	}
	public double getAutonomy() {
		return 100.0 * fuelAmount / consumption;
	}

	@Override
	public String toString() {
		return "Car with [fuelAmount =" + fuelAmount + ", consumption =" + consumption + "]";
	}
	
	


}
