package com.xworkz.bridge.dao.imple;

import com.xworkz.bridge.dao.TouristDAO;

public class TouristDAOImple implements TouristDAO {

	private String[] dataStore = new String[10];
	private int index;	

	@Override
	public boolean save(String name) {
		this.dataStore[index] = name;
		System.out.println("placee saved  " + name + "  index  " + this.index);
		index++;
		return true;
	}

	@Override
	public boolean checkname(String name) {
		for (String ref : this.dataStore)
			if (ref != null && ref.equals(name)) {
				return true;
			}

		return false;
	}

}
