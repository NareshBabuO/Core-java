	package com.xworkz.bridge.dao.service.imple;

import com.xworkz.bridge.dao.PrimeMinisterDAO;
import com.xworkz.bridge.dao.service.PrimeMinisterService;
import com.xworkz.bridge.exception.InvalidateNameException;

public class PMServiceImple implements PrimeMinisterService {

	private PrimeMinisterDAO pmDAO;

	public PMServiceImple(PrimeMinisterDAO pmDAO) {
		this.pmDAO = pmDAO;
		System.out.println("Service Constructor Creating using DAO");
	}

	@Override
	public boolean ValiddateAndSave(String name) throws InvalidateNameException {
		System.out.println("Sarting validation");
		if (name != null && name.length() > 4 && name.length() < 50) {
			if (!this.pmDAO.CheckName(name)) {
				System.out.println("name is not duplicate="+name);
				// System.out.println("Check method is running=" + name);
				return pmDAO.saveName(name);
			} else {
				System.err.println("name is duplicate");
				throw new InvalidateNameException("it is a duplicate");
			}
		} else {
			System.err.println("name is not correct");
			throw new InvalidateNameException("it is Invalid");
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
