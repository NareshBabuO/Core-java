package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.InstituteDTO;

public class InstituteRunner {

	public static void main(String[] args) {
//		eturn "InstituteDTO [name=" + name + ", type=" + type + ", owner=" + owner + ", typeOfCourse=" + typeOfCourse
//		+ ", country=" + country + ", state=" + state + ", city=" + city + ", location=" + location
//		+ ", contactNo=" + contactNo + ", hrName=" + hrName + "]";

		InstituteDTO institute = new InstituteDTO();
		System.out.println(institute.hashCode());
		institute.setCountry("India");
		institute.setState("Karnataka");
		institute.setCity("Bangalore");
		institute.setName("Xworkz");
		institute.setOwner("OM");
		institute.setTypeOfCourse("software devlopers");
		institute.setType("Java");
		institute.setLocation("BTM");
		institute.setHrName("Vinay");
		institute.setContactNo(987456310);
		System.out.println(institute);
		
		InstituteDTO institute1 = new InstituteDTO();
		System.out.println(institute1.hashCode());
		institute1.setCountry("India");
		institute1.setState("Karnataka");
		institute1.setCity("Bangalore");
		institute1.setName("Xworkz");
		institute1.setOwner("OM");
		institute1.setLocation("BTM");
		institute1.setTypeOfCourse("software devlopers");
		institute1.setType("Java");
		institute1.setHrName("Vinay");
		institute1.setContactNo(987456310);
		System.out.println(institute1);
		
		institute.equals(institute1);

	}

}
