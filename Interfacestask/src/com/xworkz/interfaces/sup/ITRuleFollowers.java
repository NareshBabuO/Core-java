package com.xworkz.interfaces.sup;

public class ITRuleFollowers implements HRRules, SecurityRules, ManagerRules {

	@Override
	public boolean applyLeaves() {
		System.out.println("need to ask about leaves HR");
		return true;

	}

	@Override
	public boolean harrasment() {
		System.out.println("if any complaint comes,you need to resign ");
		return true;
	}

	@Override
	public boolean informLeave() {
		System.out.println("Need aproval from Manager for Leave");
		return true;
	}

	@Override
	public boolean wfh() {
		System.out.println("ask manager for wfh");
		return true;
	}

	@Override
	public boolean swipeCard() {
		System.out.println("if want to enter office u need to swipeCard");
		return true;
	}

	@Override
	public boolean parkingApproval() {
		System.out.println("need parkingApproval form security team ");
		return false;
	}

}
