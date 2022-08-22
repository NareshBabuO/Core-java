package com.xworkz.inheritance.sup;

public class Cricket {

	public String country;
	public String captain;
	public String gender;

	public String setCountry(String country) {
		this.country = country;
		return country;
	}

	public String setCapatin(String captain) {
		this.captain = captain;
		return captain;
	}

	public String setGender(String gender) {
		this.gender = gender;
		return gender;
	}

	public boolean entertainment() {
		System.out.println("All Cricket match are Good");
		return true;
	}

	public double presentation(double reward) {
		System.out.println("Good Played Player got presentation " + reward);
		return reward;
	}

	public void printData()
	{
		System.out.println("country is " +this.country);
		System.out.println("Captain is " +this.captain);
		System.out.println("Gender is " +this.gender);
	}
}
