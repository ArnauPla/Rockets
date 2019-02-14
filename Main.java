package com.coets.project;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Coet coet1 = new Coet("32WESSDS", 3);
		Coet coet2 = new Coet("LDSFJA32", 6);
		
		System.out.println("El coet " + coet1.getCode() + " té " + coet1.getPropellantQuantity() + " propulsors.");
		System.out.println("El coet " + coet2.getCode() + " té " + coet2.getPropellantQuantity() + " propulsors.");

	}

}
