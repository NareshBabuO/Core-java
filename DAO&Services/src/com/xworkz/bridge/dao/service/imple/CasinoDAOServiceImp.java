
package com.xworkz.bridge.dao.service.imple;

import com.xworkz.bridge.dao.CasinoDAO;
import com.xworkz.bridge.dao.service.CasinoDAOService;

public class CasinoDAOServiceImp implements CasinoDAOService {

	private CasinoDAO casinoDAO;

	public CasinoDAOServiceImp(CasinoDAO casinoDAO) {
		this.casinoDAO = casinoDAO;
		System.out.println("Service Created using const");
	}

	@Override
	public boolean validDataAndSave(String name) {
		System.out.println("starting validDataAndSave");
		if (name != null && name.length() > 2 && name.length() < 50) {
			if (this.casinoDAO.checkname(name));
			{
				System.out.println("name is not null, looks valid");
				this.casinoDAO.save(name);
				return true;
			}
		} else {
			System.err.println("name is in valid");
		}
		return false;
	}
}
