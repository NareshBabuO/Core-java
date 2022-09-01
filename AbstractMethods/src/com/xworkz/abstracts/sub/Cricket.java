package com.xworkz.abstracts.sub;

import com.xworkz.abstracts.sup.CricketDTO;

public class Cricket extends CricketDTO {

	public Cricket() {
		super();
		System.out.println("default sub class constructor");
	}

	public Cricket(String game, String country, int totalPlayer, String captain, String stadium, String viceCaptain,
			int totalGames, String toss, String bestPlayer, String oppTeam, String winingTeam) {
		super(game, country, totalPlayer, captain, stadium, viceCaptain, totalGames, toss, bestPlayer, oppTeam,
				winingTeam);
		System.out.println("Sub class Constructor with agruments");
	}
}
