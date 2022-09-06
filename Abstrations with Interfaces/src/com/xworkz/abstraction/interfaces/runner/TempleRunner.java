package com.xworkz.abstraction.interfaces.runner;

import com.xworkz.abstraction.gym.CustomerTemple;
import com.xworkz.abstraction.gym.Temple;
import com.xworkz.abstraction.interfaces.TempleRule;

public class TempleRunner {

	public static void main(String[] args) {
		
		TempleRule templerule=new CustomerTemple();
		Temple temple= new Temple(templerule);
		temple.Checkrule();
		

	}

}
