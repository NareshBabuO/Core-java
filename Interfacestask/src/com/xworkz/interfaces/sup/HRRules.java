package com.xworkz.interfaces.sup;

public interface HRRules extends ManagerRules,SecurityRules{

	boolean applyLeaves();

	boolean harrasment();
	
@Override
default boolean swipeCard() {
	// TODO Auto-generated method stub
	return false;
}
@Override
default boolean parkingApproval() {
	// TODO Auto-generated method stub
	return false;
}
@Override
default boolean informLeave() {
	// TODO Auto-generated method stub
	return false;
}@Override
default boolean wfh() {
	// TODO Auto-generated method stub
	return false;
}

}