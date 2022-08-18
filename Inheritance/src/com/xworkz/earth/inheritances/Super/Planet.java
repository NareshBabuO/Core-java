package com.xworkz.earth.inheritances.Super;

public class Planet {

	public String name;
	public int humanPopulation;
	public double radius;

	public Planet(String name, int humanPopulation, double radius) {
		System.out.println("Constrcutor with String,int,double ");
		this.name = name;
		this.humanPopulation = humanPopulation;
		this.radius = radius;
		
	}
	public Planet()
	{
		System.out.println();
	}

}
