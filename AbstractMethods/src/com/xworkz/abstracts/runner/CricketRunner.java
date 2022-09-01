package com.xworkz.abstracts.runner;

import com.xworkz.abstracts.sub.Cricket;
import com.xworkz.abstracts.sup.CricketDTO;

public class CricketRunner {

	public static void main(String[] args) {
//		game, country, totalPlayer, captain, stadium, viceCaptain, totalGames, toss, bestPlayer, oppTeam,
//		winingTeam
		CricketDTO cricket = new Cricket();
		cricket.setGame("cricket");
		cricket.setCountry("India");
		cricket.setTotalPlayer(11);
		cricket.setStadium("Wankende");
		cricket.setViceCaptain("Virat");
		cricket.setTotalGames(22);
		cricket.setToss("India");
		cricket.setBestPlayer("Gambir");
		cricket.setOppTeam("Srilanka");
		cricket.setWiningTeam("India");
		
		System.out.println(cricket);
		
		CricketDTO cricket1=new Cricket("Cricket","India",11,"Dhoni","Monali","Virat",4,"Pakistan","Sachin","Pakistan","India");
		System.out.println(cricket1);
		
	}

}
