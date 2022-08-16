package com.xworkz.inheritancesrunners;

import com.xworkz.inheritances.*;

public class BallRunner {

	public static void main(String[] args) {
		// String from, String treeName, String color
		Ball ball = new Ball("tree", "Woody", "red");
		ball.setBrand("Cosco");
		ball.printData();
	}

}
