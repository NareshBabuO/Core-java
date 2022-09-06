package com.xworkz.abstraction.gym;

import com.xworkz.abstraction.interfaces.GymRule;

public class NareshGym implements GymRule {

	@Override
	public boolean wearkshoes() {
		System.out.println("Allowing only if wearing shoes");
		return true;
	}

	@Override
	public boolean unisex() {
		System.out.println("Allowing both sex/gender");
		return true;
	}

	@Override
	public double monthlyFee() {
		System.out.println("Montly fee");
		return 600;
	}

}
