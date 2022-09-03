package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.MobileDTO;

public class MobileRunner {

	public static void main(String[] args) {
		// (casted.model.equals(this.model)&&(casted.brand.equals(this.brand)&&(casted.color.equals(this.color)
		// &&(casted.owner.equals(this.owner)&&(casted.company.equals(this.company))))))
		MobileDTO mobile = new MobileDTO();
		System.out.println(mobile.hashCode());
		mobile.setModel("iohone12");
		mobile.setBrand("Apple");
		mobile.setColor("Gold");
		mobile.setOwner("Tim Cook");
		mobile.setCompany("IOS");
		mobile.setChargertype("C pin");

		MobileDTO mobile1 = new MobileDTO();
		System.out.println(mobile1.hashCode());
		mobile1.setModel("iohone12");
		mobile1.setBrand("Apple");
		mobile1.setColor("Gold");
		mobile1.setOwner("Tim Cook");
		mobile1.setCompany("IOS");
		mobile1.setChargertype("C pin");

		mobile.equals(mobile1);

	}

}
