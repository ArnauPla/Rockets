package com.coets.project;

public class Propellant {

	public static final int powerInterval = 10;
	
	private int maximumPower;
	private int currentPower = 0;
	

	public int getMaximumPower() {
		return maximumPower;
	}

	public void setMaximumPower(int maximumPower) {
		this.maximumPower = maximumPower;
	}
	
	public int getCurrentPower() {
		return currentPower;
	}

	public void setCurrentPower(int currentPower) {
		this.currentPower = currentPower;
	}

	public Propellant(int maximumPower) throws Exception {
		super();
		checkMaximumPower(maximumPower);
		this.maximumPower = maximumPower;
	}
	
	public void checkMaximumPower(int maximumPower) throws Exception {
		if (maximumPower < 0) {
			throw new Exception("La potència màxima no pot ser negativa.");
		}
	}
	
	public void accelerate() {		
		if(currentPower <= maximumPower - powerInterval) {
			currentPower = currentPower + powerInterval;
		}
	}
	
	public void decrease() {
		if(currentPower >= powerInterval) {
			currentPower = currentPower - powerInterval;
		}
	}
	
}
