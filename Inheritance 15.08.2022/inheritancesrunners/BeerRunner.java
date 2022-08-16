package com.xworkz.inheritancesrunners;

import com.xworkz.inheritances.Beer;

public class BeerRunner {

	public static void main(String[] args) {
		Beer beer = new Beer("beer", "kingfisher", 1);
		beer.setCost(120);
		beer.printData();
	}

}
