package com.coets.project;

import java.util.ArrayList;
import java.util.List;

public class Coet {

	private String code;
	private List<Propellant> propulsors;
	
	public Coet(String code, List<Propellant> propulsors) throws Exception {
		
		checkCode(code);
		
		checkPropellantQuantity(propulsors);

		this.code = code;
		this.propulsors = propulsors;
	}
	
	public void checkCode(String code) throws Exception {
		if (code.length() != 8) {
			throw new Exception("El codi ha de ser de 8 caràcters");
		}
	}
	
	public void checkPropellantQuantity(List<Propellant> propulsors) throws Exception {
		for (int i = 0; i < propulsors.size(); i++) {
			if (propulsors.get(i).getMaximumPower() <= 0) {
				throw new Exception("La potència màxima dels propulsors no pot ser negativa.");
			}
		}
	}

	public String getCode() {
		return code;
	}
	
	public List<Propellant> getPropellants() {
		return propulsors;
		
	}
	
	public List<Integer> listAllPropellantMaximumPower() {
		List<Integer> maximumPowers = new ArrayList<Integer>();
		for (int i = 0; i < propulsors.size(); i++) {
			maximumPowers.add(propulsors.get(i).getMaximumPower());
		}
		return maximumPowers;
	}
	
	public List<Integer> listAllPropellantCurrentPower() {
		List<Integer> currentPowers = new ArrayList<Integer>();
		for (int i = 0; i < propulsors.size(); i++) {
			currentPowers.add(propulsors.get(i).getCurrentPower());
		}
		return currentPowers;
	}

	
	public void accelerateRocket() {
		for (int i = 0; i < propulsors.size(); i++) {
			propulsors.get(i).accelerate();
		}
	}

	public void decreaseRocket() {
		for (int i = 0; i < propulsors.size(); i++) {
			propulsors.get(i).decrease();
		}
	}
	
	public void accelerateRocketXTimes(int times) {
		for(int i= 0; i<times; i++) {
			accelerateRocket();
		}
		System.out.println(getCode() + ": " + currentSpeed());
	}
	
	public void decreaseRocketXTimes(int times) {
		for(int i= 0; i<times; i++) {
			decreaseRocket();
		}
		System.out.println(getCode() + ": " + currentSpeed());
	}
	
	public double currentSpeed() {
		double initialSpeed = 0;
		int powerSum = 0;
		for (int i = 0; i < propulsors.size(); i++) {
			powerSum += propulsors.get(i).getCurrentPower();
		}
		return initialSpeed + 100 * Math.sqrt(powerSum);
		
	}
}
