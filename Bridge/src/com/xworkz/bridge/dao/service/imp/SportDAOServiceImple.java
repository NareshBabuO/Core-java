package com.xworkz.bridge.dao.service.imp;

import com.xworkz.bridge.dao.SportDAO;
import com.xworkz.bridge.dao.service.SportDAOService;

public class SportDAOServiceImple implements SportDAOService {

	private SportDAO spoartDAO;

	public SportDAOServiceImple(SportDAO spoartDAO) {
		this.spoartDAO = spoartDAO;
		System.out.println("Service Creating using DAO");
	}

	@Override
	public boolean validdateAndsave(String name) {
		System.out.println("Starting ValidDateAndSave");
		if (name != null && name.length() > 2 && name.length() < 50) {
			if (this.spoartDAO.CheckName(name))
				;
			{
				System.out.println("Name is not Equal to Null & Started validation");
				this.spoartDAO.save(name);
				return true;
			}
		}
		return false;
	}

}
