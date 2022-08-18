package com.xworkz.fruit.inheritances.sup;

public class Fruit {
	
	public String name;
	public String type;
	public double weight;
	
	public Fruit(String name,String type, double weight)
	{
		this.name=name;
		this.type=type;
		this.weight=weight;
		System.out.println("Constructor with super class args");
	}

	public Fruit() {
		System.out.println();
	}

}
