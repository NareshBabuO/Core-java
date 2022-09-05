package com.xworkz.interfaces.sup;

public class ITRuleFollowers implements HRRules, SecurityRules, ManagerRules {

	@Override
	public boolean applyLeaves() {
		System.out.println("need to ask about leaves HR");
		return true;

	}

	public boolean harrasment() {
		System.out.println("if any complaint comes,you need to resign ");
		return true;
	}

	public boolean informLeave() {
		System.out.println("Need aproval from Manager for Leave");
		return true;
	}

	public boolean wfh() {
		System.out.println("ask manager for wfh");
		return true;
	}

	public boolean swipeCard() {
		System.out.println("if want to enter office u need to swipeCard");
		return true;
	}

	public boolean parkingApproval() {
		System.out.println("need parkingApproval form security team ");
		return false;
	}

}
