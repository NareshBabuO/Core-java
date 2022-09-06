package com.xworkz.abstraction.gym;

import com.xworkz.abstraction.interfaces.TempleRule;

public class CustomerTemple implements TempleRule {

	@Override
	public boolean bath() {
		System.out.println("Bathed Persons only Entry");
		return false;
	}

	@Override
	public int poojacost() {
		System.out.println("Pooja Cost is costly");
		return 100;
	}

	@Override
	public double specialEntry() {
		System.out.println("There is a SpecialEntry Cost Supperate");
		return 500;
	}

}
