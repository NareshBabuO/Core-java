package com.xworkz.inheritance.sup;

public class Keyboard {
	
	public String brand;
	public int totalKey;
	public String longkey;
	
	public Keyboard(String brand,int totalKey,String longkey)
	{
		System.out.println("Constructor with String , int , String  args");
	this.brand=brand;
	this.totalKey=totalKey;
	this.longkey=longkey;
	}
	
	public Keyboard() {
		System.out.println();
	}


}
