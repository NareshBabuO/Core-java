package com.xworkz.bridge.dao.runner;

import com.xworkz.bridge.dao.TouristDAO;
import com.xworkz.bridge.dao.imple.TouristDAOImple;
import com.xworkz.bridge.dao.service.TouristService;
import com.xworkz.bridge.dao.service.imp.TouristServiceImple;
import com.xworkz.bridge.exception.InvalidPlaceException;

public class TouristRunner {

	public static void main(String[] args) {

		TouristDAO dao = new TouristDAOImple();

		TouristService service = new TouristServiceImple(dao);

		try {
			service.validateAndSave("Maldives");
			service.validateAndSave("Goa");
			service.validateAndSave("koorg");
			service.validateAndSave("Kasmir");
			service.validateAndSave("Udupi");
			service.validateAndSave("Kodagu");
		//	service.validateAndSave("chikkamangalur");
			service.validateAndSave("Hampi");
			service.validateAndSave("Belur");
			service.validateAndSave("Mata");
			service.validateAndSave("Mata-2");
		//	service.validateAndSave("Mata-3");
		} catch (InvalidPlaceException type) {
			System.out.println(type.getMessage());
			System.out.println(type.getCause());
		}

	}
}
