package com.xworkz.inheritancesrunners;

import com.xworkz.inheritances.*;

public class HelicopterRunner {

	public static void main(String[] args) {

		Plane plane = new Plane("AreDrome", 2, 222);
		plane.setWeight(442d);
		plane.printData();

	}

}
