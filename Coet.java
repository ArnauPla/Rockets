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
		for (int i = 0; i<propulsors.size(); i++) {
			if (propulsors.get(i).getMaximumPower() <= 0) {
				throw new Exception("El nombre de propulsors ha de ser més gran que zero.");
			}
		}
	}

	public String getCode() {
		return code;
	}
	
	public List<Integer> listAllPropellantMaximumPower() {
		List<Integer> maximumPowers = new ArrayList<Integer>();
		for (int i = 0; i < propulsors.size(); i++) {
			maximumPowers.add(propulsors.get(i).getMaximumPower());
		}
		return maximumPowers;
	}
}
