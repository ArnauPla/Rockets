package com.coets.project;

public class Propellant {

	private int maximumPower;

	public int getMaximumPower() {
		return maximumPower;
	}

	public void setMaximumPower(int maximumPower) {
		this.maximumPower = maximumPower;
	}

	public Propellant(int maximumPower) {
		super();
		this.maximumPower = maximumPower;
	}
}
