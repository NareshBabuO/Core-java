package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.SchoolDTO;

public class SchoolRunner {

	public static void main(String[] args) {

		SchoolDTO school = new SchoolDTO();
		System.out.println(school.hashCode());
		school.setName("Anthyodaya School");
		school.setClassTeacher("Vidya");

		SchoolDTO school3 = new SchoolDTO();
		System.out.println(school3.hashCode());
		school3.setName("Anthyodaya School");
		school3.setClassTeacher("Vidya");

		school.equals(school3);

	}

}
