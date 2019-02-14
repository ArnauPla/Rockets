package com.coets.project;

public class Coet {

	private String code;
	private int propellantQuantity;
	
	public Coet(String code, int propellantQuantity) throws Exception {
		
		checkCode(code);

		this.code = code;
		this.propellantQuantity = propellantQuantity;
	}
	
	public void checkCode(String code) throws Exception {
		if (code.length() != 8) {
			throw new Exception("El codi ha de ser de 8 caràcters");
		}
	}

	public String getCode() {
		return code;
	}

	public int getPropellantQuantity() {
		return propellantQuantity;
	}
}
