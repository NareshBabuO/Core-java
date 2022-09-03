package com.xworkz.sup.dto;

public class SchoolDTO {

	private String name;
	private String area;
	private String city;
	private String state;
	private String country;
	private String continent;
	private String ownerName;
	private int totalschools;
	private String ownerWife;
	private int ownerTotalchilders;
	private String ownerChild1Name;
	private String ownerChild2Name;
	private String principleName;
	private int totalrooms;
	private int total1stclassSection;
	private int total2stclassSection;
	private int total3stclassSection;
	private int total4stclassSection;
	private int total5stclassSection;
	private int total6stclassSection;
	private int total7stclassSection;
	private int total8thclassSection;
	private int total9thclassSection;
	private int total10thclassSection;
	private int totalSubin1stClass;
	private String subject1;
	private String subject2;
	private String subject3;
	private String subject4;
	private String subject5;
	private String subject6;
	private int yourclass;
	private String classTeacher;
	private String kannadaTeachername;
	private String englishTeachername;
	private String hindiTeachername;
	private String scienceTeachername;
	private String matheTeachername;
	private String socialscienceTeachername;
	private int totalStudentin1stClass;
	private int totalStudentin2ndClass;
	private int totalStudentin3rdClass;
	private int totalStudentin4thClass;
	private int totalStudentin5thClass;
	private int totalStudentin6thClass;
	private int totalStudentin7thClass;
	private int totalStudentin8thClass;
	private int totalStudentin9thClass;
	private int totalStudentin10thClass;
	private double totalFeePerStudent;

	public SchoolDTO() {
		System.out.println("default  Constructor");
	}

	public SchoolDTO(String name, String area, String city, String state, String country, String continent,
			String ownerName, int totalschools, String ownerWife, int ownerTotalchilders, String ownerChild1Name,
			String ownerChild2Name, String principleName, int totalrooms, int total1stclassSection,
			int total2stclassSection, int total3stclassSection, int total4stclassSection, int total5stclassSection,
			int total6stclassSection, int total7stclassSection, int total8thclassSection, int total9thclassSection,
			int total10thclassSection, int totalSubin1stClass, String subject1, String subject2, String subject3,
			String subject4, String subject5, String subject6, int yourclass, String classTeacher,
			String kannadaTeachername, String englishTeachername, String hindiTeachername, String scienceTeachername,
			String matheTeachername, String socialscienceTeachername, int totalStudentin1stClass,
			int totalStudentin2ndClass, int totalStudentin3rdClass, int totalStudentin4thClass,
			int totalStudentin5thClass, int totalStudentin6thClass, int totalStudentin7thClass,
			int totalStudentin8thClass, int totalStudentin9thClass, int totalStudentin10thClass,
			double totalFeePerStudent) {
		super();
		this.name = name;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.continent = continent;
		this.ownerName = ownerName;
		this.totalschools = totalschools;
		this.ownerWife = ownerWife;
		this.ownerTotalchilders = ownerTotalchilders;
		this.ownerChild1Name = ownerChild1Name;
		this.ownerChild2Name = ownerChild2Name;
		this.principleName = principleName;
		this.totalrooms = totalrooms;
		this.total1stclassSection = total1stclassSection;
		this.total2stclassSection = total2stclassSection;
		this.total3stclassSection = total3stclassSection;
		this.total4stclassSection = total4stclassSection;
		this.total5stclassSection = total5stclassSection;
		this.total6stclassSection = total6stclassSection;
		this.total7stclassSection = total7stclassSection;
		this.total8thclassSection = total8thclassSection;
		this.total9thclassSection = total9thclassSection;
		this.total10thclassSection = total10thclassSection;
		this.totalSubin1stClass = totalSubin1stClass;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.subject4 = subject4;
		this.subject5 = subject5;
		this.subject6 = subject6;
		this.yourclass = yourclass;
		this.classTeacher = classTeacher;
		this.kannadaTeachername = kannadaTeachername;
		this.englishTeachername = englishTeachername;
		this.hindiTeachername = hindiTeachername;
		this.scienceTeachername = scienceTeachername;
		this.matheTeachername = matheTeachername;
		this.socialscienceTeachername = socialscienceTeachername;
		this.totalStudentin1stClass = totalStudentin1stClass;
		this.totalStudentin2ndClass = totalStudentin2ndClass;
		this.totalStudentin3rdClass = totalStudentin3rdClass;
		this.totalStudentin4thClass = totalStudentin4thClass;
		this.totalStudentin5thClass = totalStudentin5thClass;
		this.totalStudentin6thClass = totalStudentin6thClass;
		this.totalStudentin7thClass = totalStudentin7thClass;
		this.totalStudentin8thClass = totalStudentin8thClass;
		this.totalStudentin9thClass = totalStudentin9thClass;
		this.totalStudentin10thClass = totalStudentin10thClass;
		this.totalFeePerStudent = totalFeePerStudent;
	}

	@Override
	public int hashCode() {
		return 15;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			System.out.println("Object is not equal to NUll");

			if (obj instanceof SchoolDTO) {
				System.out.println("Object is of table type");
				SchoolDTO casted = (SchoolDTO) obj;
				if (casted.name.equals(name) && (casted.classTeacher.equals(classTeacher))) {
					System.out.println("Both are same");
					return true;
				} else 
				{
					System.err.println("Both are not same/diffrent");
				}
			} else

			{
				System.out.println("Object is not of a table type");
			}
		}
		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getTotalschools() {
		return totalschools;
	}

	public void setTotalschools(int totalschools) {
		this.totalschools = totalschools;
	}

	public String getOwnerWife() {
		return ownerWife;
	}

	public void setOwnerWife(String ownerWife) {
		this.ownerWife = ownerWife;
	}

	public int getOwnerTotalchilders() {
		return ownerTotalchilders;
	}

	public void setOwnerTotalchilders(int ownerTotalchilders) {
		this.ownerTotalchilders = ownerTotalchilders;
	}

	public String getOwnerChild1Name() {
		return ownerChild1Name;
	}

	public void setOwnerChild1Name(String ownerChild1Name) {
		this.ownerChild1Name = ownerChild1Name;
	}

	public String getOwnerChild2Name() {
		return ownerChild2Name;
	}

	public void setOwnerChild2Name(String ownerChild2Name) {
		this.ownerChild2Name = ownerChild2Name;
	}

	public String getPrincipleName() {
		return principleName;
	}

	public void setPrincipleName(String principleName) {
		this.principleName = principleName;
	}

	public int getTotalrooms() {
		return totalrooms;
	}

	public void setTotalrooms(int totalrooms) {
		this.totalrooms = totalrooms;
	}

	public int getTotal1stclassSection() {
		return total1stclassSection;
	}

	public void setTotal1stclassSection(int total1stclassSection) {
		this.total1stclassSection = total1stclassSection;
	}

	public int getTotal2stclassSection() {
		return total2stclassSection;
	}

	public void setTotal2stclassSection(int total2stclassSection) {
		this.total2stclassSection = total2stclassSection;
	}

	public int getTotal3stclassSection() {
		return total3stclassSection;
	}

	public void setTotal3stclassSection(int total3stclassSection) {
		this.total3stclassSection = total3stclassSection;
	}

	public int getTotal4stclassSection() {
		return total4stclassSection;
	}

	public void setTotal4stclassSection(int total4stclassSection) {
		this.total4stclassSection = total4stclassSection;
	}

	public int getTotal5stclassSection() {
		return total5stclassSection;
	}

	public void setTotal5stclassSection(int total5stclassSection) {
		this.total5stclassSection = total5stclassSection;
	}

	public int getTotal6stclassSection() {
		return total6stclassSection;
	}

	public void setTotal6stclassSection(int total6stclassSection) {
		this.total6stclassSection = total6stclassSection;
	}

	public int getTotal7stclassSection() {
		return total7stclassSection;
	}

	public void setTotal7stclassSection(int total7stclassSection) {
		this.total7stclassSection = total7stclassSection;
	}

	public int getTotal8thclassSection() {
		return total8thclassSection;
	}

	public void setTotal8thclassSection(int total8thclassSection) {
		this.total8thclassSection = total8thclassSection;
	}

	public int getTotal9thclassSection() {
		return total9thclassSection;
	}

	public void setTotal9thclassSection(int total9thclassSection) {
		this.total9thclassSection = total9thclassSection;
	}

	public int getTotal10thclassSection() {
		return total10thclassSection;
	}

	public void setTotal10thclassSection(int total10thclassSection) {
		this.total10thclassSection = total10thclassSection;
	}

	public int getTotalSubin1stClass() {
		return totalSubin1stClass;
	}

	public void setTotalSubin1stClass(int totalSubin1stClass) {
		this.totalSubin1stClass = totalSubin1stClass;
	}

	public String getSubject1() {
		return subject1;
	}

	public void setSubject1(String subject1) {
		this.subject1 = subject1;
	}

	public String getSubject2() {
		return subject2;
	}

	public void setSubject2(String subject2) {
		this.subject2 = subject2;
	}

	public String getSubject3() {
		return subject3;
	}

	public void setSubject3(String subject3) {
		this.subject3 = subject3;
	}

	public String getSubject4() {
		return subject4;
	}

	public void setSubject4(String subject4) {
		this.subject4 = subject4;
	}

	public String getSubject5() {
		return subject5;
	}

	public void setSubject5(String subject5) {
		this.subject5 = subject5;
	}

	public String getSubject6() {
		return subject6;
	}

	public void setSubject6(String subject6) {
		this.subject6 = subject6;
	}

	public int getYourclass() {
		return yourclass;
	}

	public void setYourclass(int yourclass) {
		this.yourclass = yourclass;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public String getKannadaTeachername() {
		return kannadaTeachername;
	}

	public void setKannadaTeachername(String kannadaTeachername) {
		this.kannadaTeachername = kannadaTeachername;
	}

	public String getEnglishTeachername() {
		return englishTeachername;
	}

	public void setEnglishTeachername(String englishTeachername) {
		this.englishTeachername = englishTeachername;
	}

	public String getHindiTeachername() {
		return hindiTeachername;
	}

	public void setHindiTeachername(String hindiTeachername) {
		this.hindiTeachername = hindiTeachername;
	}

	public String getScienceTeachername() {
		return scienceTeachername;
	}

	public void setScienceTeachername(String scienceTeachername) {
		this.scienceTeachername = scienceTeachername;
	}

	public String getMatheTeachername() {
		return matheTeachername;
	}

	public void setMatheTeachername(String matheTeachername) {
		this.matheTeachername = matheTeachername;
	}

	public String getSocialscienceTeachername() {
		return socialscienceTeachername;
	}

	public void setSocialscienceTeachername(String socialscienceTeachername) {
		this.socialscienceTeachername = socialscienceTeachername;
	}

	public int getTotalStudentin1stClass() {
		return totalStudentin1stClass;
	}

	public void setTotalStudentin1stClass(int totalStudentin1stClass) {
		this.totalStudentin1stClass = totalStudentin1stClass;
	}

	public int getTotalStudentin2ndClass() {
		return totalStudentin2ndClass;
	}

	public void setTotalStudentin2ndClass(int totalStudentin2ndClass) {
		this.totalStudentin2ndClass = totalStudentin2ndClass;
	}

	public int getTotalStudentin3rdClass() {
		return totalStudentin3rdClass;
	}

	public void setTotalStudentin3rdClass(int totalStudentin3rdClass) {
		this.totalStudentin3rdClass = totalStudentin3rdClass;
	}

	public int getTotalStudentin4thClass() {
		return totalStudentin4thClass;
	}

	public void setTotalStudentin4thClass(int totalStudentin4thClass) {
		this.totalStudentin4thClass = totalStudentin4thClass;
	}

	public int getTotalStudentin5thClass() {
		return totalStudentin5thClass;
	}

	public void setTotalStudentin5thClass(int totalStudentin5thClass) {
		this.totalStudentin5thClass = totalStudentin5thClass;
	}

	public int getTotalStudentin6thClass() {
		return totalStudentin6thClass;
	}

	public void setTotalStudentin6thClass(int totalStudentin6thClass) {
		this.totalStudentin6thClass = totalStudentin6thClass;
	}

	public int getTotalStudentin7thClass() {
		return totalStudentin7thClass;
	}

	public void setTotalStudentin7thClass(int totalStudentin7thClass) {
		this.totalStudentin7thClass = totalStudentin7thClass;
	}

	public int getTotalStudentin8thClass() {
		return totalStudentin8thClass;
	}

	public void setTotalStudentin8thClass(int totalStudentin8thClass) {
		this.totalStudentin8thClass = totalStudentin8thClass;
	}

	public int getTotalStudentin9thClass() {
		return totalStudentin9thClass;
	}

	public void setTotalStudentin9thClass(int totalStudentin9thClass) {
		this.totalStudentin9thClass = totalStudentin9thClass;
	}

	public int getTotalStudentin10thClass() {
		return totalStudentin10thClass;
	}

	public void setTotalStudentin10thClass(int totalStudentin10thClass) {
		this.totalStudentin10thClass = totalStudentin10thClass;
	}

	public double getTotalFeePerStudent() {
		return totalFeePerStudent;
	}

	public void setTotalFeePerStudent(double totalFeePerStudent) {
		this.totalFeePerStudent = totalFeePerStudent;
	}

	@Override
	public String toString() {
		return "SchoolDTO [name=" + name + ", yourclass=" + yourclass + "]";
	}

}
