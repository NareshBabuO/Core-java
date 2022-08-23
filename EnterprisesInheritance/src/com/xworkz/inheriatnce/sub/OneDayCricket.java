package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.Cricket;

public class OneDayCricket extends Cricket {
	public String bestBatsman;
	public String bestBowler;
	

	public OneDayCricket(String bestBatsman,String bestBowler)
	{
		this.bestBatsman=bestBatsman;
		this.bestBowler=bestBowler;
	}
	public String manOfSeries(String MOM)
	{
		System.out.println("The Man of series goes to "+MOM);
		return MOM;
	}
	@Override
	public double presentation(double price)
	{
		System.out.println("Presentation is "+price);
		return price;
	}
	@Override
	public boolean entertainment()
	{
		System.out.println("The Match is good entertainment");
		return true;
	}
	public void printData()
	{
		super.printData();
		System.out.println("the best batsman award goes to "+this.bestBatsman);
		System.out.println("The best bowler award goes to "+this.bestBowler);
	}
}
