package com.xworkz.abstraction.interfaces.runner;

import com.xworkz.abstraction.gym.GymStaff;
import com.xworkz.abstraction.gym.NareshGym;
import com.xworkz.abstraction.interfaces.GymRule;

public class GymRunner {

	public static void main(String[] args) {
		GymRule gr = new NareshGym();
		GymStaff gs = new GymStaff(gr);
		gs.checkRule();

	}

}
