package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.Planet;

public class EarthPlanet extends Planet {

	public String shape;
	public String color;
	public int totalContinents;
 public EarthPlanet()
 {
	 super();
	 System.out.println("Constrcutor with  String,String,int ");
 }
	public void printData() {
		System.out.println(super.name);
		System.out.println(super.humanPopulation);
		System.out.println(super.radius);
		System.out.println(this.shape);
		System.out.println(this.color);
		System.out.println(this.totalContinents);
	}
}
