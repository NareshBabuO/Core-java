package com.xworkz.accessmodifier.sup;

public class HondaAutoMobile extends AutoMobile {

	public double openTime;
	public double closeTime;

	public HondaAutoMobile(double openTime, double closeTime) {
		this.openTime = openTime;
		this.closeTime = closeTime;
		System.out.println("HondaAutomobile constructor");
	}

	@Override
	public void printData() {

		System.out.println(super.brand);
		System.out.println(super.type);
		System.out.println(this.openTime);
		System.out.println(this.closeTime);
	}
}
