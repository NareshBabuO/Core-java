package com.xworkz.bridge.dao.service;

import com.xworkz.bridge.exception.InvalidPlaceException;

public interface PrimeMinisterService {
	
	boolean ValiddateAndSave(String name)throws InvalidPlaceException;

}
