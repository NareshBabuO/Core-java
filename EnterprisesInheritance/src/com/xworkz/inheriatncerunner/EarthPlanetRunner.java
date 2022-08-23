package com.xworkz.inheriatncerunner;

import com.xworkz.inheriatnce.sub.EarthPlanet;
import com.xworkz.inheritance.sup.Planet;

public class EarthPlanetRunner {

	public static void main(String[] args) {

		EarthPlanet ep = new EarthPlanet();
		ep.name = "Earth";
		ep.humanPopulation = 5;
		ep.radius = 6371;
		ep.color = "Blue";
		ep.shape = "ovel";
		ep.totalContinents = 7;
		ep.printData();

		Planet planet = new EarthPlanet();

		EarthPlanet convertedfromParent = (EarthPlanet) planet;
		{
			convertedfromParent.name = "Earth-1";
			convertedfromParent.humanPopulation = 6;
			convertedfromParent.radius = 6371;
			convertedfromParent.color = "blue";
			convertedfromParent.shape = "ovel";
			convertedfromParent.totalContinents = 7;
			convertedfromParent.printData();
		}

	}

}
