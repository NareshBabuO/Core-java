package com.xworkz.sup.dto;

public class CricketDTO {

	private String game;
	private String match;// semi final
	private String team;
	private int totalPlayer;
	private String captain;
	private String viceCaptain;
	private String player1name;
	private String player2name;
	private String player3name;
	private String player4name;
	private String player5name;
	private String player6name;
	private String player7name;
	private String player8name;
	private String player9name;
	private String player10name;
	private String player11name;
	private String oppTeam;
	private String oppTeamCaptain;
	private String oppTeamplayer1name;
	private String oppTeamplayer2name;
	private String oppTeamplayer3name;
	private String oppTeamplayer4name;
	private String oppTeamplayer5name;
	private String oppTeamplayer6name;
	private String oppTeamplayer7name;
	private String oppTeamplayer8name;
	private String oppTeamplayer9name;
	private String oppTeamplayer10name;
	private String oppTeamplayer11name;
	private String tosswinby;
	private int score;
	private String winby;
	private int higestScore;
	private String bestplayerofSeries;
	private String mos;
	private String highestwicket;
	private String finisher;

	public CricketDTO() {
		System.out.println("Default constructor");
	}

	public CricketDTO(String game, String match, String team, int totalPlayer, String captain, String viceCaptain,
			String player1name, String player2name, String player3name, String player4name, String player5name,
			String player6name, String player7name, String player8name, String player9name, String player10name,
			String player11name, String oppTeam, String oppTeamCaptain, String oppTeamplayer1name,
			String oppTeamplayer2name, String oppTeamplayer3name, String oppTeamplayer4name, String oppTeamplayer5name,
			String oppTeamplayer6name, String oppTeamplayer7name, String oppTeamplayer8name, String oppTeamplayer9name,
			String oppTeamplayer10name, String oppTeamplayer11name, String tosswinby, int score, String winby,
			int higestScore, String bestplayerofSeries, String mos, String highestwicket, String finisher) {
		super();
		this.game = game;
		this.match = match;
		this.team = team;
		this.totalPlayer = totalPlayer;
		this.captain = captain;
		this.viceCaptain = viceCaptain;
		this.player1name = player1name;
		this.player2name = player2name;
		this.player3name = player3name;
		this.player4name = player4name;
		this.player5name = player5name;
		this.player6name = player6name;
		this.player7name = player7name;
		this.player8name = player8name;
		this.player9name = player9name;
		this.player10name = player10name;
		this.player11name = player11name;
		this.oppTeam = oppTeam;
		this.oppTeamCaptain = oppTeamCaptain;
		this.oppTeamplayer1name = oppTeamplayer1name;
		this.oppTeamplayer2name = oppTeamplayer2name;
		this.oppTeamplayer3name = oppTeamplayer3name;
		this.oppTeamplayer4name = oppTeamplayer4name;
		this.oppTeamplayer5name = oppTeamplayer5name;
		this.oppTeamplayer6name = oppTeamplayer6name;
		this.oppTeamplayer7name = oppTeamplayer7name;
		this.oppTeamplayer8name = oppTeamplayer8name;
		this.oppTeamplayer9name = oppTeamplayer9name;
		this.oppTeamplayer10name = oppTeamplayer10name;
		this.oppTeamplayer11name = oppTeamplayer11name;
		this.tosswinby = tosswinby;
		this.score = score;
		this.winby = winby;
		this.higestScore = higestScore;
		this.bestplayerofSeries = bestplayerofSeries;
		this.mos = mos;
		this.highestwicket = highestwicket;
		this.finisher = finisher;
	}

	@Override
	public int hashCode() {
		return 28;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj !=null)
		{
			if (obj instanceof CricketDTO)
			{
				System.out.println("Object is type of table");
				CricketDTO casted =(CricketDTO)obj;
				if (casted.captain.equals(this.captain)&&(casted.team.equals(this.team)))
				{
					System.out.println("Both are same");
					return true;
				}
				else {
					System.err.println("Both are not same// both are different");
				}
			}
				else
				{
					System.err.println("Object is not type of table");
				}
			}
		return super.equals(obj);
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getMatch() {
		return match;
	}

	public void setMatch(String match) {
		this.match = match;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
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

	public String getViceCaptain() {
		return viceCaptain;
	}

	public void setViceCaptain(String viceCaptain) {
		this.viceCaptain = viceCaptain;
	}

	public String getPlayer1name() {
		return player1name;
	}

	public void setPlayer1name(String player1name) {
		this.player1name = player1name;
	}

	public String getPlayer2name() {
		return player2name;
	}

	public void setPlayer2name(String player2name) {
		this.player2name = player2name;
	}

	public String getPlayer3name() {
		return player3name;
	}

	public void setPlayer3name(String player3name) {
		this.player3name = player3name;
	}

	public String getPlayer4name() {
		return player4name;
	}

	public void setPlayer4name(String player4name) {
		this.player4name = player4name;
	}

	public String getPlayer5name() {
		return player5name;
	}

	public void setPlayer5name(String player5name) {
		this.player5name = player5name;
	}

	public String getPlayer6name() {
		return player6name;
	}

	public void setPlayer6name(String player6name) {
		this.player6name = player6name;
	}

	public String getPlayer7name() {
		return player7name;
	}

	public void setPlayer7name(String player7name) {
		this.player7name = player7name;
	}

	public String getPlayer8name() {
		return player8name;
	}

	public void setPlayer8name(String player8name) {
		this.player8name = player8name;
	}

	public String getPlayer9name() {
		return player9name;
	}

	public void setPlayer9name(String player9name) {
		this.player9name = player9name;
	}

	public String getPlayer10name() {
		return player10name;
	}

	public void setPlayer10name(String player10name) {
		this.player10name = player10name;
	}

	public String getPlayer11name() {
		return player11name;
	}

	public void setPlayer11name(String player11name) {
		this.player11name = player11name;
	}

	public String getOppTeam() {
		return oppTeam;
	}

	public void setOppTeam(String oppTeam) {
		this.oppTeam = oppTeam;
	}

	public String getOppTeamCaptain() {
		return oppTeamCaptain;
	}

	public void setOppTeamCaptain(String oppTeamCaptain) {
		this.oppTeamCaptain = oppTeamCaptain;
	}

	public String getOppTeamplayer1name() {
		return oppTeamplayer1name;
	}

	public void setOppTeamplayer1name(String oppTeamplayer1name) {
		this.oppTeamplayer1name = oppTeamplayer1name;
	}

	public String getOppTeamplayer2name() {
		return oppTeamplayer2name;
	}

	public void setOppTeamplayer2name(String oppTeamplayer2name) {
		this.oppTeamplayer2name = oppTeamplayer2name;
	}

	public String getOppTeamplayer3name() {
		return oppTeamplayer3name;
	}

	public void setOppTeamplayer3name(String oppTeamplayer3name) {
		this.oppTeamplayer3name = oppTeamplayer3name;
	}

	public String getOppTeamplayer4name() {
		return oppTeamplayer4name;
	}

	public void setOppTeamplayer4name(String oppTeamplayer4name) {
		this.oppTeamplayer4name = oppTeamplayer4name;
	}

	public String getOppTeamplayer5name() {
		return oppTeamplayer5name;
	}

	public void setOppTeamplayer5name(String oppTeamplayer5name) {
		this.oppTeamplayer5name = oppTeamplayer5name;
	}

	public String getOppTeamplayer6name() {
		return oppTeamplayer6name;
	}

	public void setOppTeamplayer6name(String oppTeamplayer6name) {
		this.oppTeamplayer6name = oppTeamplayer6name;
	}

	public String getOppTeamplayer7name() {
		return oppTeamplayer7name;
	}

	public void setOppTeamplayer7name(String oppTeamplayer7name) {
		this.oppTeamplayer7name = oppTeamplayer7name;
	}

	public String getOppTeamplayer8name() {
		return oppTeamplayer8name;
	}

	public void setOppTeamplayer8name(String oppTeamplayer8name) {
		this.oppTeamplayer8name = oppTeamplayer8name;
	}

	public String getOppTeamplayer9name() {
		return oppTeamplayer9name;
	}

	public void setOppTeamplayer9name(String oppTeamplayer9name) {
		this.oppTeamplayer9name = oppTeamplayer9name;
	}

	public String getOppTeamplayer10name() {
		return oppTeamplayer10name;
	}

	public void setOppTeamplayer10name(String oppTeamplayer10name) {
		this.oppTeamplayer10name = oppTeamplayer10name;
	}

	public String getOppTeamplayer11name() {
		return oppTeamplayer11name;
	}

	public void setOppTeamplayer11name(String oppTeamplayer11name) {
		this.oppTeamplayer11name = oppTeamplayer11name;
	}

	public String getTosswinby() {
		return tosswinby;
	}

	public void setTosswinby(String tosswinby) {
		this.tosswinby = tosswinby;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getWinby() {
		return winby;
	}

	public void setWinby(String winby) {
		this.winby = winby;
	}

	public int getHigestScore() {
		return higestScore;
	}

	public void setHigestScore(int higestScore) {
		this.higestScore = higestScore;
	}

	public String getBestplayerofSeries() {
		return bestplayerofSeries;
	}

	public void setBestplayerofSeries(String bestplayerofSeries) {
		this.bestplayerofSeries = bestplayerofSeries;
	}

	public String getMos() {
		return mos;
	}

	public void setMos(String mos) {
		this.mos = mos;
	}

	public String getHighestwicket() {
		return highestwicket;
	}

	public void setHighestwicket(String highestwicket) {
		this.highestwicket = highestwicket;
	}

	public String getFinisher() {
		return finisher;
	}

	public void setFinisher(String finisher) {
		this.finisher = finisher;
	}

	@Override
	public String toString() {
		return "CricketDTO [team=" + team + ", captain=" + captain + "]";
	}

}
