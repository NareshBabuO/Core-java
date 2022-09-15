package com.xworkz.bridge.dao.service.imp;

import com.xworkz.bridge.dao.TouristDAO;
import com.xworkz.bridge.dao.service.TouristService;
import com.xworkz.bridge.exception.InvalidPlaceException;

public class TouristServiceImple implements TouristService {

	private TouristDAO dao;

	public TouristServiceImple(TouristDAO dao) {
		this.dao = dao;
		System.out.println("Tourist Service Creating using DAO ");
	}

	@Override
	public boolean validateAndSave(String name) throws InvalidPlaceException {
		System.out.println("Staring validation");
		if (name != null && name.length() > 2 && name.length() < 10) {
			if (!this.dao.checkname(name)) {
				System.out.println("check method is running :" + name);
				return this.dao.save(name);

			} else {
				System.err.println("place is not valid");
				throw new InvalidPlaceException("duplicate");
			}

		} else {
			System.err.println("place is not correct");
			throw new InvalidPlaceException("invalid");
		}
	}
}
	
	//	if (name != null && name.length() > 2 && name.length() < 10) {
//			if (!this.dao.checkname(name)) {
//				System.out.println("Checking method is running =" + ":" + name);
//				return this.dao.checkname(name);
//			} else {
//				System.err.println("Place is not valid");
//				throw new InvalidPlaceException("Duplicate");
//			}
//		} else {
//			System.out.println("Place is not Correct");
//			throw new InvalidPlaceException("Invalid");
//		}
//		// return false;
//	}
//
//}
