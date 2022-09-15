package com.xworkz.bridge.dao.service;

import com.xworkz.bridge.exception.InvalidPlaceException;

public interface TouristService {

	boolean validateAndSave(String name) throws InvalidPlaceException;

}
