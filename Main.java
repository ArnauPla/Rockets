package com.coets.project;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		List<Propellant> propulsors1 = new ArrayList();
		propulsors1.add(new Propellant(10));
		propulsors1.add(new Propellant(30));
		propulsors1.add(new Propellant(80));

		List<Propellant> propulsors2 = new ArrayList();
		propulsors2.add(new Propellant(30));
		propulsors2.add(new Propellant(40));
		propulsors2.add(new Propellant(50));
		propulsors2.add(new Propellant(50));
		propulsors2.add(new Propellant(30));
		propulsors2.add(new Propellant(10));

		Coet coet1 = new Coet("32WESSDS", propulsors1);
		Coet coet2 = new Coet("LDSFJA32", propulsors2);

		printRocket(coet1);
		printRocket(coet2);
		
	}
	
	public static void printRocket(Coet rocket) {
		String powersString = rocket.listAllPropellantMaximumPower().toString();
		System.out.println(rocket.getCode() + ": " + powersString.substring(1, powersString.length()-1));
	}
}
