package com.xworkz.inheriatnce.sub;

public class OnlineSuperMarket extends SuperMarket{

	public String appName;
	public String ordertype;
	public String type;

	public OnlineSuperMarket() {
		super();
		System.out.println("Default onlinesupermarket constructor");
	}
	public OnlineSuperMarket(String appName, String ordertype, String type) {
		this.appName = appName;
		this.ordertype = ordertype;
		this.type = type;
		System.out.println("OSM Constructors");
	}
	public void printData2() {
		System.out.println(super.area);//market
		System.out.println(super.discount);//market
		System.out.println(super.name);//market
		System.out.println(super.brand);//supermarket
		System.out.println(super.owner);//supermarket
		System.out.println(super.budget);//supermarket
		System.out.println(this.appName);
		System.out.println(this.ordertype);
		System.out.println(this.type);
	}
}
