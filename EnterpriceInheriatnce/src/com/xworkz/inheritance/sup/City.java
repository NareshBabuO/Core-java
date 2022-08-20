package com.xworkz.inheritance.sup;

public class City {
	
	public String name;
	public String famusfor;
	public int population;
	
	public City(String name, String famusfor,int population)
	{
		this.name=name;
		this.famusfor=famusfor;
		this.population=population;
		System.out.println("Constructor with SuperClass arguments");
	}
	public City()
	{
		System.out.println("default");
		
	}
	public void printData() 
	{
		System.out.println(this.name);
		System.out.println(this.famusfor);
		System.out.println(this.population);
	}

}
