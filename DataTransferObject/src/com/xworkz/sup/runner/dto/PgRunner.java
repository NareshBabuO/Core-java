package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.PgDTO;

public class PgRunner {

	public static void main(String[] args) {

		PgDTO pg = new PgDTO();
		System.out.println(pg.hashCode());
		pg.setPgname("KrishnaPG");
		pg.setArea("BTM");

		PgDTO pg1 = new PgDTO();
		System.out.println(pg1.hashCode());
		pg1.setPgname("KrishnaPG");
		pg1.setArea("BTM");

		pg.equals(pg1);
	}

}
