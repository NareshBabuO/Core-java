package com.xworkz.accessmodifier.sup;

public class Trainer {

	protected String name;
	protected int exp;
	protected String specialization;

	protected Trainer() {
		System.out.println("Default constructor");
	}

	protected Trainer(String name, int exp, String specialization) {
		this.name = name;
		this.exp = exp;
		this.specialization = specialization;
		System.out.println("Constructor with arguments");
	}

	protected boolean training() {
		System.out.println("This trainer is a good Trainer");
		return true;
	}

//	protected String conductInterview(String Interview) {
//		if(Interview=="Interview")
//		System.out.println("The trainer will conduct the interview ");
//		return "WealkyOnce";
//	}
	protected boolean conductInterview(){
		System.out.println("The trainer conduct Interview At wealkyOnce ");
		return true;
	}

	protected boolean coding() {
		System.out.println("This trainer is a good at coding");
		return true;
	}
	

	protected void printData() {
		System.out.println(this.name);
		System.out.println(this.exp);
		System.out.println(this.specialization);
//		System.out.println(this.training());
//		System.out.println(this.conductInterview());
//		System.out.println(this.coding());
	}

}
