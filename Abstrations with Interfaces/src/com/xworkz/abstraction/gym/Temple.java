package com.xworkz.abstraction.gym;

import com.xworkz.abstraction.interfaces.TempleRule;

public class Temple {
	private TempleRule templerule;

	public Temple(TempleRule templerule) {
		super();
		System.out.println("Temple Constructor");
		this.templerule = templerule;
	}
	
	public void Checkrule() {
		System.out.println("Checking Rule of Temple");
		boolean bath = this.templerule.bath();
		int poojacost = this.templerule.poojacost();
		double specialEntry = this.templerule.specialEntry();
		if(bath && poojacost>=100 && specialEntry>=500) {
			System.out.println("All Rules are Fallowed");
		}
		else {
			System.err.println("Rule not fallowed");
		}
	}
	

}
