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
	
	public List<Integer> listAllPropellantMaximumPower() {
		List<Integer> maximumPowers = new ArrayList<Integer>();
		for (int i = 0; i < propellantQuantity; i++) {
			maximumPowers.add(propulsors.get(i).getMaximumPower());
		}
		return maximumPowers;
	}
}
