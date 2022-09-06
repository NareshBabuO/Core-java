package com.xworkz.abstraction.interfaces.runner;

import com.xworkz.abstraction.gym.CustomerPubRule;
import com.xworkz.abstraction.gym.DownTownPub;
import com.xworkz.abstraction.interfaces.PubRule;

public class PubRunner {
	
	PubRule pubrule= new CustomerPubRule();
	DownTownPub dtp=new DownTownPub(pubrule);
	


}
