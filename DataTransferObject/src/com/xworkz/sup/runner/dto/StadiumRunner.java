package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.StadiumDTO;

public class StadiumRunner {

	public static void main(String[] args) {

		StadiumDTO stadium = new StadiumDTO();
		System.out.println(stadium.hashCode());
		stadium.setCountry("India");
		stadium.setState("Karnataka");
		stadium.setCity("Bangalore");
		stadium.setType("Cricket");
		stadium.setName("Chinnaswamy cridangana");
		System.out.println(stadium);
		
		StadiumDTO stadium1 = new StadiumDTO();
		System.out.println(stadium1.hashCode());
		stadium1.setCountry("India");
		stadium1.setState("Karnataka");
		stadium1.setCity("Bangalore");
		stadium1.setType("Cricket");
		stadium1.setName("Chinnaswamy cridangana");
		
		stadium.equals(stadium1);
		System.out.println(stadium1);
		
		
		
		
	}

}
