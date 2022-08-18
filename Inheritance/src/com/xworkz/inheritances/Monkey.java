package com.xworkz.inheritances;

public class Monkey {
	
	public String name="Homo sapiens";
	public int legs;
	public int fingers;
	public String headShape;
	
	
	public Monkey(int legs,int fingers,String headShape)
	{
		System.out.println("Constructor with arguments");
		this.legs=legs;
		this.fingers=fingers;
		this.headShape=headShape;
	}
	public void printData()
	{
		System.out.println(this.name);
		System.out.println(this.legs);
		System.out.println(this.fingers);
		System.out.println(this.headShape);
	}

}
