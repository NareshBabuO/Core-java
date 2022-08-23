package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.City;

public class Bangalore extends City {

	public String stateName;
	public int totalAirport;
	public double radius;

	public Bangalore(String name, String famusfor, int population) {
		super(name, famusfor, population);
		System.out.println("Constructor with superclass Argument");
	}
	public Bangalore()
	{
		super();
		System.out.println("default");
	}

	public Bangalore(String stateName, int totalAirport, double radius) {
		this.stateName = stateName;
		this.totalAirport = totalAirport;
		this.radius = radius;
		System.out.println("Constructor with subclass Arguments ");
	}
	public void printData1()
	{
		System.out.println(super.name);
		System.out.println(super.famusfor);
		System.out.println(super.population);
		System.out.println(this.stateName);
		System.out.println(this.totalAirport);
		System.out.println(this.radius);
	}

}
