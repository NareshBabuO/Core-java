package com.xworkz.bridge.dao.service.imp;

import javax.management.InvalidAttributeValueException;

import com.xworkz.bridge.dao.PrimeMinisterDAO;
import com.xworkz.bridge.dao.service.PrimeMinisterService;
import com.xworkz.bridge.exception.InvalidPlaceException;

public class PMServiceImple implements PrimeMinisterService {

	private PrimeMinisterDAO pmDAO;

	public PMServiceImple(PrimeMinisterDAO pmDAO) {
		this.pmDAO = pmDAO;
		System.out.println("Service Constructor Creating using DAO");
	}

	@Override
	public boolean ValiddateAndSave(String name) throws InvalidPlaceException {
		System.out.println("Sarting validation");
		if (name != null && name.length() > 4 && name.length() < 50) {
			if (!this.pmDAO.CheckName(name)) {
				System.out.println("Check method is running=" + name);
				return this.pmDAO.save(name);
			} else {
				System.err.println("name is not valid");
				throw new InvalidPlaceException("duplicate");
			}
		} else {
			System.err.println("name is not correct");
			throw new InvalidPlaceException("Invalid");
		}
	}
}

//			{
//				System.out.println("Name is not equal to Null ad Started validation");
//				boolean check = this.pmDAO.save(name);
//				return check;
//			}
//		}
// return false;
