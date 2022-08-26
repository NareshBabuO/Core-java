package com.xworkz.accessmodifier.sub;

import com.xworkz.accessmodifier.sup.Trainer;

public class Omkar extends Trainer {
	
	public Omkar() {
		System.out.println("Default constructor");
	}
	public Omkar(String name, int exp, String specialization) {
		super(name, exp, specialization);
		System.out.println("Sub class constructor with args");
	}

	@Override
	public boolean coding() {
		return super.coding();
	}

	@Override
	public boolean conductInterview() {
		return super.conductInterview();
	}

	@Override
	public boolean training() {
		return super.training();
	}

	public void getName(String name) {
		this.name = name;
		System.out.println("The name of a Trainer is " + name);
	}

	public void getExp(int exp) {
		this.exp = exp;
		System.out.println("The total exp have " + exp);
	}

	public void getSpecialization(String specialization) {
		this.specialization = specialization;
		System.out.println("The specialiazation of trainer is " + specialization);
	}

	@Override
	public void printData() {
		super.printData();
		System.out.println(this.name);
		System.out.println(this.exp);
		System.out.println(this.specialization);
	}

}
