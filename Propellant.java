package com.coets.project;

import java.util.List;

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

	public void checkMaximumPower(int maximumPower) throws Exception {
		if (maximumPower < 0) {
			throw new Exception("La potència màxima no pot ser negativa.");
		}
	}
	
}
