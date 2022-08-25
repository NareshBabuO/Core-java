package com.xworkz.accessmodifier.runner;

import com.xworkz.accessmodifier.base.TataAutoMobile;
import com.xworkz.accessmodifier.sup.AutoMobile;
import com.xworkz.accessmodifier.sup.HondaAutoMobile;

public class AutoMobileRunner {

	public static void main(String[] args) {

		AutoMobile am=new AutoMobile();
		am.setType("Four Wheeler");
		am.setBrand("Kia");
		double val=am.sellAccesscories("tyer");
		System.out.println(val);
		
		System.out.println("===============");
		
		HondaAutoMobile ham=new HondaAutoMobile(9.30,7.30);
		ham.setType("4 Wheeler");
		ham.setBrand("Honda");
		ham.printData();
		
		System.out.println("++++++++++++++++");
		TataAutoMobile tam=new TataAutoMobile();
		tam.setType("4Wheeler");
		tam.setBrand("TATA");
		tam.printData();
	}

}
