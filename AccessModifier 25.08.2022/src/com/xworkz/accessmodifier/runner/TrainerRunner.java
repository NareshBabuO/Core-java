package com.xworkz.accessmodifier.runner;

import com.xworkz.accessmodifier.sup.Trainer;
import com.xworkz.accessmodifier.sub.*;

public class TrainerRunner {

	public static void main(String[] args) {
		
		Trainer trainer=new Omkar();
		Omkar om=(Omkar) trainer;//casting
		om.coding();
		om.conductInterview();
//		String st=om.conductInterview();
		om.getExp(14);
		om.getName("Omkar");
		om.getSpecialization("Java");
		om.training();
		
		System.out.println("+++++++++++++++++++");

		Omkar om1 = new Omkar("Omkar",13,"Java");
		//om1.printData();
		om1.coding();
		om1.conductInterview();
		om1.training();
	}

}
