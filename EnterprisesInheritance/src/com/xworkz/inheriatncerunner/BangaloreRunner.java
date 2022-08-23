package com.xworkz.inheriatncerunner;

import com.xworkz.inheriatnce.sub.Bangalore;
import com.xworkz.inheriatnce.sub.Mysore;
import com.xworkz.inheritance.sup.City;

public class BangaloreRunner {

	public static void main(String[] args) {

		City city = new City("Bangalore", "Garden City", 13193000);
		city.printData();
		System.out.println("================================");
		Bangalore ban = new Bangalore("Karnataka", 7, 2137);
		ban.name = "Bangalore-1";
		ban.famusfor = "ciliconCity";
		ban.population = 130;
		ban.printData1();
		System.out.println("================================");
		Mysore mysore = new Mysore("Mysore", "Yaduraja", 155);
		mysore.name = "Mysore-1";
		mysore.famusfor = "Dasara";
		mysore.population = 1261000;
		mysore.printData2();
		System.out.println("================================");
		City city1 = new Bangalore();

		Bangalore bangalore = (Bangalore) city1;
		bangalore.name = "BTM";
		bangalore.famusfor = "cafe";
		bangalore.population = 34436;
		bangalore.stateName = "Karnataka";
		bangalore.totalAirport = 0;
		bangalore.radius = 7;
		bangalore.printData1();

		System.out.println("================================");
		City city2 = new Mysore();
		
		Mysore mysore1 = (Mysore) city2;
		mysore1.name = "Tumkur";
		mysore1.name1 = "Kalpataru Nadu";
		mysore1.founder = "Kante Arasu";
		mysore1.famusfor = "Cocanut";
		mysore1.population = 334574;
		mysore1.area = 10597;
		mysore1.printData2();
	}

}
