package com.xworkz.abstraction.gym;

import com.xworkz.abstraction.interfaces.PubRule;

public class CustomerPubRule implements PubRule {

	@Override
	public boolean dressCodefollowed() {
		System.out.println("Track pants and t-shirts are only Allowed");
		return true;
	}

	@Override
	public int age() {
		System.out.println("only 18+ agers are Allowed");
		return 20;
	}

	@Override
	public boolean validProof() {
		System.out.println("need vaidProof for Entry");
		return true;
	}

}
