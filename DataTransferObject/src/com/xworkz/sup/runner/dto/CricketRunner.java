package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.CricketDTO;

public class CricketRunner {

	public static void main(String[] args) {

		CricketDTO cricket = new CricketDTO();
		System.out.println(cricket.hashCode());
		cricket.setCaptain("MSD");
		cricket.setTeam("India");
		// cricket.
		System.out.println(cricket);

		CricketDTO cricket1 = new CricketDTO();
		System.out.println(cricket1.hashCode());
		cricket1.setCaptain("MSD");
		cricket1.setTeam("India");

		cricket.equals(cricket1);
	}

}
