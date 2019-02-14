package com.coets.project;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {

		List<Propellant> propulsors1 = new ArrayList();
		Propellant propulsor1 = new Propellant(10);
		propulsors1.add(propulsor1);

		List<Propellant> propulsors2 = new ArrayList();
		Propellant propulsor2 = new Propellant(30);
		propulsors2.add(propulsor2);

		Coet coet1 = new Coet("32WESSDS", propulsors1);
		Coet coet2 = new Coet("LDSFJA32", propulsors2);

		System.out.println(coet1.getCode() + ": " + propulsors1);

		for (int i = 0; i < propulsors1.size(); i++) {
			System.out.println(propulsors1.get(i).getMaximumPower());
		}

		System.out.println(coet2.getCode() + ": " + propulsors2.get(0).getMaximumPower());

		for (int i = 0; i < propulsors2.size(); i++) {
			System.out.println(propulsors2.get(i).getMaximumPower());
		}
	}
}
