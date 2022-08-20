package com.xworkz.inheritance.sup;

public class Market {
	
	public String name;
	public String area;
	public String discount;
	
	public Market()
	{
		System.out.println("defaut super class");
	}
	public Market(String name,String area,String discount)
	{
		this.name=name;
		this.area=area;
		this.discount=discount;
		System.out.println("Constructor with super class arguments");
	}
	public void PrintData()
	{
		System.out.println(this.name);
		System.out.println(this.area);
		System.out.println(this.discount);
	}

}
