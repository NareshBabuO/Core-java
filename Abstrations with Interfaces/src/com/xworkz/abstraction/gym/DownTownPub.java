package com.xworkz.abstraction.gym;

import com.xworkz.abstraction.interfaces.PubRule;

public class DownTownPub {

	private PubRule pubrule;

	public DownTownPub(PubRule pubrule) {
		System.out.println("Constrctor with arguments");
		this.pubrule = pubrule;
	}

	public void checkrules() {
		System.out.println("Checking rules");
		boolean dressCodefollowed = this.pubrule.dressCodefollowed();
		int age = this.pubrule.age();
		boolean validProof = this.pubrule.validProof();
		if (dressCodefollowed && validProof && age > 18) {
			System.out.println("Rules are fallowed && Customer Allowed");
		} else {
			System.out.println("Rules are not fallowed && No Entry");
		}
	}

}
