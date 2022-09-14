package com.xworkz.bridge.dao.imple;

import com.xworkz.bridge.dao.SportDAO;

public class SportDAOImple implements SportDAO {

	private String[] namesofSports = new String[5];
	private int index = 0;

	@Override
	public boolean save(String name) {
		//System.out.println("Saving names");
		this.namesofSports[this.index] = name;
		System.out.println("Saved" +"="+ name + "," + "index" +"=" + this.index);
		this.index++;
		return true;
	}

	@Override
	public boolean CheckName(String name) {
		for (String ref : this.namesofSports) {
			if (ref != null && ref.equals(name))
				System.out.println("name is valid");
			return true;
		}
		return false;
	}

}
