package com.coets.project;

public class Propellant {

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

	public Propellant(int maximumPower) {
		super();
		this.maximumPower = maximumPower;
	}
}
