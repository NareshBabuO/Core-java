package com.xworkz.abstraction.gym;

import com.xworkz.abstraction.interfaces.GymRule;

public class GymStaff {

	private GymRule gymrule;
	
	public GymStaff(GymRule gymrule) {
		System.out.println(" GymStaff Constructor");
		this.gymrule=gymrule;
	}
	
	public void checkRule() {
		System.out.println("Checking rules");
		double monthlyFee = this.gymrule.monthlyFee();
		boolean unisex = this.gymrule.unisex();
		boolean wearkshoes = this.gymrule.wearkshoes();
		if(unisex && wearkshoes && monthlyFee>200) {
			System.out.println("rules are fallowed");
		}
		else {
			System.err.println("Rules are not fallowed");
		}
	}
	
}
