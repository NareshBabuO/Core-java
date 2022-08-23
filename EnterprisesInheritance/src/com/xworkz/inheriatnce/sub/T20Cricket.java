package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.Cricket;

public class T20Cricket extends Cricket {
	
	public String manOfSeries(String bestPlayer)
	{
		System.out.println("in T20 Match The ManofSeries goes to "+bestPlayer);
		return bestPlayer;
	}
	@Override
	public boolean entertainment()
	{
		System.out.println("This T20 match is best man");
		return true;
	}
	public void printData()
	{
		super.printData();
	}
	

}
