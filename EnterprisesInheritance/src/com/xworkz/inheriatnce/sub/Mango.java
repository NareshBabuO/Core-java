package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.Fruit;

public class Mango extends Fruit{
	
	public String from;
	public int costperKg;
	public String award;
	
	public Mango()
	{
		super();
		System.out.println("Constructor with sub class args");
	}
	public void printData()
	{
	System.out.println(super.name);	
	System.out.println(super.type);
	System.out.println(super.weight);
	System.out.println(this.from);
	System.out.println(this.costperKg);
	System.out.println(this.award);
	
	
	
	}
	
	

}
