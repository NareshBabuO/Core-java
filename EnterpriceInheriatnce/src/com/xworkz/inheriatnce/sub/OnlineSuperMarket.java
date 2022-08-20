package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.Market;

public class OnlineSuperMarket extends Market {

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
		System.out.println(super.area);
		System.out.println(super.discount);
		System.out.println(super.name);
		System.out.println(this.appName);
		System.out.println(this.ordertype);
		System.out.println(this.type);
	}
}
