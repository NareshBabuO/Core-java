package com.xworkz.inheriatncerunner;

import com.xworkz.inheriatnce.sub.OnlineSuperMarket;
import com.xworkz.inheriatnce.sub.SuperMarket;
import com.xworkz.inheritance.sup.Market;

public class MarketRunner {

	public static void main(String[] args) {

		Market market = new Market("KrishnaRaja Market", "60%", "KR Market");
		market.PrintData();
		System.out.println("==========================");
		SuperMarket sm = new SuperMarket("US Polo", "Alok Dubey", 147852);
		sm.area = "KR Market";
		sm.discount = "50%";
		sm.name = "KrishnaRaja Market";
		sm.printData1();
		System.out.println("==========================");

		OnlineSuperMarket osm = new OnlineSuperMarket("zepto", "HomeDelevery", "online Payment");
		osm.area = "KR Market";
		osm.discount = "50%";
		osm.name = "KrishnaRaja Market";
		osm.brand = "US polo";
		osm.owner = "Alok Dubey";
		osm.budget = 147852;
		osm.printData2();
		System.out.println("**********************");

		Market market1 = new SuperMarket();
		if (market1 instanceof SuperMarket) {
			SuperMarket sm2 = (SuperMarket) market1;// casting
			System.out.println("Hello Casting  done"+"\n");
		}
		SuperMarket sm1 = new OnlineSuperMarket();
		if (sm1 instanceof OnlineSuperMarket) {
			OnlineSuperMarket osm1 = (OnlineSuperMarket) sm1;//casting
			System.out.println("Hello casting  done"+"\n");
		}
		Market market2 = new OnlineSuperMarket();//
		if (market2 instanceof OnlineSuperMarket) {
			OnlineSuperMarket osm2 = (OnlineSuperMarket) market2;//casting
	System.out.println("Hello Casting done"+"\n");
		}

	}
}
