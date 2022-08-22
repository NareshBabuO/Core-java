package com.xworkz.inheriatnce.sub;

import com.xworkz.inheritance.sup.Cricket;

public class TestCricket extends Cricket {

	public String groundType;

	public String setGroundType(String groundType) {
		this.groundType = groundType;
		return groundType;
	}

	@Override
	public double presentation(double price) {
		System.out.println("The best player go price of " + price);
		return price;
	}

	public void printData1() {
		super.printData();
		System.out.println("In testCricket The groundType is " + this.groundType);
	}

}
