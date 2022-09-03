package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.SuperMarketDTO;

public class SuperMarketRunner {

	public static void main(String[] args) {

		SuperMarketDTO sm = new SuperMarketDTO();
		System.out.println(sm.hashCode());
		sm.setName("VishalMart");
		sm.setLocation("HSR");
		sm.setRatings(3.8);
		sm.setCity("Bangalore");
		sm.setTrolley(true);
		sm.setMail("vishalmarthsr86@gmail.com");

		SuperMarketDTO sm1 = new SuperMarketDTO();
		System.out.println(sm1.hashCode());
		sm1.setName("VishalMart");
		sm1.setLocation("HSR");
		sm1.setRatings(3.8);
		sm1.setCity("Bangalore");
		sm1.setTrolley(true);
		sm1.setMail("vishalmarthsr86@gmail.com");

		sm.equals(sm1);

	}

}
