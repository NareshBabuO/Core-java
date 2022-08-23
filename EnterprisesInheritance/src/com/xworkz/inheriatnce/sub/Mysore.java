package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.City;

public class Mysore extends City {
	
	public String name1;
	public String founder;
	public int area;
	
	public Mysore()
	{
		super();
		System.out.println("Default args");
	}
	public Mysore(String name1,String founder,int area)
	{
		this.name1=name1;
		this.founder=founder;
		this.area=area;
		System.out.println("Constructor with subsuperclass");
	}
	public void printData2()
	{
	System.out.println(super.name);
	System.out.println(super.famusfor);
	System.out.println(super.population);
	System.out.println(this.name1);
	System.out.println(this.founder);
	System.out.println(this.area);
	}

}
