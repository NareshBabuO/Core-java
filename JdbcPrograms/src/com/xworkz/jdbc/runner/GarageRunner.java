package com.xworkz.jdbc.runner;

import com.xworkz.jdbc.dto.GarageDTO;
import com.xworkz.jdbc.service.GarageService;
import com.xworkz.jdbc.service.GarageServiceImp;

public class GarageRunner {

	public static void main(String[] args) {

		
		GarageDTO gdto = new GarageDTO("Sagar Automobile", "Bangalore", "BothBike&Cars", 7000);
		GarageService gs=new GarageServiceImp();
		gs.validdateAndSave(gdto);
	}

}
