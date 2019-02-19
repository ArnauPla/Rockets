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
		
		printRocketMaximum(coet1);
		printRocketMaximum(coet2);	
		
		System.out.println(coet1.getCode() + ": " + coet1.currentSpeed());
		System.out.println(coet2.getCode() + ": " + coet2.currentSpeed());
		
		coet1.accelerateRocketXTimes(3);
		coet2.accelerateRocketXTimes(3);
		
		coet1.decreaseRocketXTimes(5);
		coet2.accelerateRocketXTimes(7);

		coet1.accelerateRocketXTimes(15);
		coet2.accelerateRocketXTimes(15);
		
	}
	
	public static void printRocketMaximum(Coet rocket) {
		String powersString = rocket.listAllPropellantMaximumPower().toString();
		String powerWithoutBrackets = powersString.substring(1, powersString.length()-1);
		System.out.println(rocket.getCode() + ": " + powerWithoutBrackets);
	}
}
