package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.HouseDTO;

public class HouseRunner {

	public static void main(String[] args) {

		HouseDTO house = new HouseDTO();
		System.out.println(house.hashCode());
		house.setHouseNo("Prakrithi Nilaya");
		house.setCountry("India");
		house.setState("Karnataka");
		house.setColony("Srinidi");
		house.setSolarHeater("V guard");
		house.setCity("pavagda");
		house.setExternalPaintColor("light player");
		System.out.println(house);

		HouseDTO house1 = new HouseDTO();
		System.out.println(house1.hashCode());
		house1.setHouseNo("Prakrithi Nilaya");
		house1.setCountry("India");
		house1.setState("Karnataka");
		house1.setCity("pavagada");
		house1.setSolarHeater("V guard");
		house1.setColony("Srinidi");
		house1.setExternalPaintColor("light player");
		System.out.println(house1);

		house.equals(house1);
		System.out.println(house1);

	}

}
