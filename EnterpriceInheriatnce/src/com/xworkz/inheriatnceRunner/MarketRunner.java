package com.xworkz.inheriatnceRunner;

import com.xworkz.inheriatnce.sub.OnlineSuperMarket;
import com.xworkz.inheriatnce.sub.SuperMarket;
import com.xworkz.inheritance.sup.Market;

public class MarketRunner {

	public static void main(String[] args) {

		Market market = new Market("KR Market", "30%", "Krishnaraja Market");
		market.PrintData();
		System.out.println("======================");
		SuperMarket sm = new SuperMarket();
		sm.name = "Shivajinagar";
		sm.area = "Shivaji Nagar";
		sm.owner = "Shivaji";
		sm.brand = "Mary's Basilica";
		sm.discount = "45";
		sm.budget = 450000;
		sm.printData1();
		System.out.println("======================");
		OnlineSuperMarket osm = new OnlineSuperMarket();
		osm.appName = "Zepto";
		osm.ordertype = "home Delivery";
		osm.type = "Online";
		osm.printData2();
		System.out.println("======================");

		Market mar = new SuperMarket();

		SuperMarket sm1 = (SuperMarket) mar;
		sm1.area = "Pune";
		sm1.name = "Lalbajar";
		sm1.discount = "30%";
		sm1.brand = "Arrow";
		sm1.budget = 700000;
		sm1.owner = "Arjun";
		sm1.printData1();
		System.out.println("======================");
		Market mar1 = new OnlineSuperMarket();

		OnlineSuperMarket osm1 = (OnlineSuperMarket) mar1;
		osm1.area = "Tumkur";
		osm1.name = "Antrasalli";
		osm1.discount = "60";
		osm1.appName = "Swigy";
		osm1.ordertype = "CashonDelivery";
		osm1.type = "HomeDelevery";
		osm1.printData2();
	}
}
