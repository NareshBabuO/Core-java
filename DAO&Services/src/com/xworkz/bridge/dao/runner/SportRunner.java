package com.xworkz.bridge.dao.runner;

import com.xworkz.bridge.dao.SportDAO;
import com.xworkz.bridge.dao.imple.SportDAOImple;
import com.xworkz.bridge.dao.service.SportService;
import com.xworkz.bridge.dao.service.imple.SportDAOServiceImple;

public class SportRunner {

	public static void main(String[] args) {
		
		SportDAO sportDAO = new SportDAOImple();
		sportDAO.CheckName("Cricket");
		sportDAO.save("Cricket");
		
		System.out.println("------------------");
		
		SportService sportDAOService= new SportDAOServiceImple(sportDAO);
		boolean valid=sportDAOService.validdateAndsave("Test Cricket");
		System.out.println(valid);
	}

}
