package com.xworkz.resume.dto;

public class JobApplicationDTO {

	private String name;
	private String email;
	private Long phoneNo;
	private Long altPhoneNo;
	private String gender;
	private String degree;
	private Integer yop;
	private String university;
	private String address;
	private String skill;
	private String s1;
	private String s2;
	private String s3;
	private String s4;
	private String s5;
	private String s6;
	private String s7;
	private String s8;
	private String s9;
	private String s10;
	private String s11;
	private String s12;
	private String s13;
	private String s14;
	private Double salary;
	private Integer exp;
	private String idProof;
	private String idProofNo;

	public JobApplicationDTO() {
		System.out.println("Default constructor");
	}

	public JobApplicationDTO(String name, String email, Long phoneNo, Long altPhoneNo, String gender,
			String degree, Integer yop, String university, String address, String skill, String s1, String s2,
			String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10, String s11,
			String s12, String s13, String s14, Double salary, Integer exp, String idProof, String idProofNo) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.altPhoneNo = altPhoneNo;
		this.gender = gender;
		this.degree = degree;
		this.yop = yop;
		this.university = university;
		this.address = address;
		this.skill = skill;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
		this.s8 = s8;
		this.s9 = s9;
		this.s10 = s10;
		this.s11 = s11;
		this.s12 = s12;
		this.s13 = s13;
		this.s14 = s14;
		this.salary = salary;
		this.exp = exp;
		this.idProof = idProof;
		this.idProofNo = idProofNo;
	}
	

}
