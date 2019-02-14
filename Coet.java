package com.coets.project;

import java.util.ArrayList;
import java.util.List;

public class Coet {

	private String code;
	private List<Propellant> propulsors;
	private int propellantQuantity;
	
	public Coet(String code, List<Propellant> propulsors) throws Exception {
		
		checkCode(code);

		this.code = code;
		this.propulsors = propulsors;
		this.propellantQuantity = propulsors.size();
	}
	
	public void checkCode(String code) throws Exception {
		if (code.length() != 8) {
			throw new Exception("El codi ha de ser de 8 caràcters");
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
		for (int i = 0; i < propellantQuantity; i++) {
			maximumPowers.add(propulsors.get(i).getMaximumPower());
		}
		return maximumPowers;
	}
	
	public List<Integer> listAllPropellantCurrentPower() {
		List<Integer> currentPowers = new ArrayList<Integer>();
		for (int i = 0; i < propellantQuantity; i++) {
			currentPowers.add(propulsors.get(i).getCurrentPower());
		}
		return currentPowers;
	}

	
	public void accelerateRocket() {
		for (int i = 0; i < propellantQuantity; i++) {
			if(propulsors.get(i).getCurrentPower() <= propulsors.get(i).getMaximumPower()-10) {
				propulsors.get(i).setCurrentPower(propulsors.get(i).getCurrentPower()+10);
			}
		}
	}
	
	public void decreaseRocket(Coet rocket) {
		for (int i = 0; i < propellantQuantity; i++) {
			if(propulsors.get(i).getCurrentPower() >= 10) {
				propulsors.get(i).setCurrentPower(propulsors.get(i).getCurrentPower()-10);
			}
		}
	}
}
