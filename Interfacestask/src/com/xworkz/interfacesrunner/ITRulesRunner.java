package com.xworkz.interfacesrunner;

import com.xworkz.interfaces.sup.HRRules;
import com.xworkz.interfaces.sup.ITRuleFollowers;
import com.xworkz.interfaces.sup.ManagerRules;
import com.xworkz.interfaces.sup.SecurityRules;

public class ITRulesRunner {

	public static void main(String[] args) {

		ITRuleFollowers itrule = new ITRuleFollowers();
		itrule.applyLeaves();
		itrule.harrasment();
		itrule.swipeCard();
		itrule.parkingApproval();
		itrule.informLeave();
		itrule.wfh();

		System.out.println("++++++++++++++++++");

		HRRules hrrule = (ITRuleFollowers) itrule;
		hrrule.applyLeaves();
		hrrule.harrasment();

		System.out.println("-------------------");

		ManagerRules mgrules = (ITRuleFollowers) itrule;
		mgrules.informLeave();
		mgrules.wfh();

		System.out.println("======================");

		SecurityRules scrules = (ITRuleFollowers) itrule;
		scrules.swipeCard();
		scrules.parkingApproval();

	}

}
