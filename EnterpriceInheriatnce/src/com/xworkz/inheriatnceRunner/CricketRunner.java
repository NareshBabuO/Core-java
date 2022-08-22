package com.xworkz.inheriatnceRunner;

import com.xworkz.inheriatnce.sub.OneDayCricket;
import com.xworkz.inheriatnce.sub.T20Cricket;
import com.xworkz.inheriatnce.sub.TestCricket;
import com.xworkz.inheritance.sup.Cricket;

public class CricketRunner {

	public static void main(String[] args) {

		Cricket cricket = new Cricket();
		cricket.setCountry("India");
		cricket.setCapatin("MS Dhoni");
		cricket.setGender("Male");
		cricket.entertainment();
		cricket.presentation(120000);
		cricket.printData();

		System.out.println("========================");

		TestCricket ct = new TestCricket();
		ct.setCountry("India");
		ct.setCapatin("MS Dhoni");
		ct.setGender("Male");
		ct.entertainment();
		ct.presentation(100000);
		ct.setGroundType("reyGrass");
		ct.printData1();

		System.out.println("+++++++++++++++++++++++++");
		OneDayCricket odc = new OneDayCricket("Virat", "Bhuvi");
		odc.setCountry("India");
		odc.setCapatin("Dhoni");
		odc.setGender("Male");
		odc.entertainment();
		odc.presentation(50000000);
		odc.manOfSeries("Yuvraj shing");
		odc.printData2();
		System.out.println("====================");
		
		T20Cricket t20=new T20Cricket();
		t20.setCountry("India");
		t20.setCapatin("Rohit");
		t20.setGender("Male");
		t20.entertainment();
		t20.manOfSeries("Virat");
		t20.presentation(100000);
		t20.printData3();
	}

}
