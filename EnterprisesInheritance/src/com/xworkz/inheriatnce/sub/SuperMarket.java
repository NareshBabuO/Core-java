package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.Market;

public class SuperMarket extends Market {

	public String brand;
	public String owner;
	public int budget;

	public SuperMarket() {
		super();
		System.out.println("Default sub class Constructor");
	}
	public SuperMarket(String brand,String owner,int budget)
	{
		this.brand=brand;
		this.owner=owner;
		this.budget=budget;
		System.out.println("Constructor of superMarket arguments");
	}
	public void printData1() 
	{
		System.out.println(super.name);
		System.out.println(super.area);
		System.out.println(super.discount);
		System.out.println(this.brand);
		System.out.println(this.owner);
		System.out.println(this.budget);
		
	}

}
