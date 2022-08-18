package com.xworkz.inheritancesrunners;

import com.xworkz.inheritances.*;

public class MetroRunner {

	public static void main(String[] args) {
		Train train = new Train("NammaMetro", 12, "Online");
		train.setEndStop("yalachanahalli");
		train.printData();

	}
}
