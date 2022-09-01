package com.xworkz.abstracts.sup;

public abstract class CricketDTO {

	private String game;
	private String country;
	private int totalPlayer;
	private String captain;
	private String stadium;
	private String viceCaptain;
	private int totalGames;
	private String toss;
	private String bestPlayer;
	private String oppTeam;
	private String winingTeam;

	public CricketDTO() {
		System.out.println("Default constructor");
	}

	
	public CricketDTO(String game, String country, int totalPlayer, String captain, String stadium, String viceCaptain,
			int totalGames, String toss, String bestPlayer, String oppTeam, String winingTeam) {
		super();
		this.game = game;
		this.country = country;
		this.totalPlayer = totalPlayer;
		this.captain = captain;
		this.stadium = stadium;
		this.viceCaptain = viceCaptain;
		this.totalGames = totalGames;
		this.toss = toss;
		this.bestPlayer = bestPlayer;
		this.oppTeam = oppTeam;
		this.winingTeam = winingTeam;
	}
	

	public String getGame() {
		return game;
	}


	public void setGame(String game) {
		this.game = game;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getTotalPlayer() {
		return totalPlayer;
	}


	public void setTotalPlayer(int totalPlayer) {
		this.totalPlayer = totalPlayer;
	}


	public String getCaptain() {
		return captain;
	}


	public void setCaptain(String captain) {
		this.captain = captain;
	}


	public String getStadium() {
		return stadium;
	}


	public void setStadium(String stadium) {
		this.stadium = stadium;
	}


	public String getViceCaptain() {
		return viceCaptain;
	}


	public void setViceCaptain(String viceCaptain) {
		this.viceCaptain = viceCaptain;
	}


	public int getTotalGames() {
		return totalGames;
	}


	public void setTotalGames(int totalGames) {
		this.totalGames = totalGames;
	}


	public String getToss() {
		return toss;
	}


	public void setToss(String toss) {
		this.toss = toss;
	}


	public String getBestPlayer() {
		return bestPlayer;
	}


	public void setBestPlayer(String bestPlayer) {
		this.bestPlayer = bestPlayer;
	}


	public String getOppTeam() {
		return oppTeam;
	}


	public void setOppTeam(String oppTeam) {
		this.oppTeam = oppTeam;
	}


	public String getWiningTeam() {
		return winingTeam;
	}


	public void setWiningTeam(String winingTeam) {
		this.winingTeam = winingTeam;
	}


	@Override
	public String toString() {
		return "CricketDTC [game=" + game + ", contry=" + country + ", totalPlayer=" + totalPlayer + ", caption="
				+ captain + ", stadium=" + stadium + ", viceCpaptain=" + viceCaptain + ", totalGames=" + totalGames
				+ ", toss=" + toss + ", bestPlayer=" + bestPlayer + ", oppTeam=" + oppTeam + ", winingTeam="
				+ winingTeam + "]";
	}
}
