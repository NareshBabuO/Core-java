package com.xworkz.bridge.dao.runner;

import com.xworkz.bridge.dao.CasinoDAO;
import com.xworkz.bridge.dao.imple.CasinoDAOImple;
import com.xworkz.bridge.dao.service.CasinoDAOService;
import com.xworkz.bridge.dao.service.imple.CasinoDAOServiceImp;

public class CasinoRunner {

	public static void main(String[] args) {

		CasinoDAO casinoDAO = new CasinoDAOImple();
		casinoDAO.save("JETLAG");
		System.out.println("============");

		CasinoDAOService casinoDAOService = new CasinoDAOServiceImp(casinoDAO);
		boolean check = casinoDAOService.validDataAndSave("JetLag");
		System.out.println(check);
		//System.out.println("+++++++++++");
//		boolean validName = casinoDAOService
//				.validDataAndSave("CasinoDAOService casinoDAOService=new CasinoDAOServiceImp(casinoDAO)");
//		System.out.println(validName);
	}

}
