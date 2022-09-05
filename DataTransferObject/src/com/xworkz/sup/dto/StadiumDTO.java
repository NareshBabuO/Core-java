package com.xworkz.sup.dto;

public class StadiumDTO {

	private String type;
	private String name;
	private String country;
	private String state;
	private String city;
	private int pincode;
	private double priceOfHighmast;
	private int noOfOpenGymEquipments;
	private int noHighmast;
	private boolean basketBall;
	private int crowdCapacity;
	private int noOfGates;
	private double entryFees;
	private boolean runningTrack;
	private boolean kabaddiCourt;
	private boolean javelineThrow;
	private int noOfBuilding;
	private boolean tableTennisCourt;
	private int noOfTableTennisCourt;
	private boolean carromBoard;
	private int noOfCarromBoard;
	private boolean gymnastics;
	private boolean openGym;
	private boolean badmintonCourt;
	private int noOfBadmintonCourt;
	private boolean cricketNet;
	private int noOfCricketNet;
	private double priceOfCarromBoard;
	private boolean poleVault;
	private boolean publicToilet;
	private boolean longJumpCourt;
	private int noOfLongJumpCourt;
	private boolean highJumpCourt;
	private int noOfHighJumpCourt;
	private int noOfPlayers;
	private int noOfMirrors;
	private int noOfComodes;
	private int noOfWashBasin;
	private int noOfTaps;
	private int noOfAdvertisementBoard;
	private int noOfChairs;
	private double priceOfChair;
	private boolean commentryBox;
	private int noOfCommentators;
	private int ageOfCommentator;

	public StadiumDTO() {
		System.out.println("Default Constructor");
	}

	public StadiumDTO(String type, String name, String country, String state, String city, int pincode,
			double priceOfHighmast, int noOfOpenGymEquipments, int noHighmast, boolean basketBall, int crowdCapacity,
			int noOfGates, double entryFees, boolean runningTrack, boolean kabaddiCourt, boolean javelineThrow,
			int noOfBuilding, boolean tableTennisCourt, int noOfTableTennisCourt, boolean carromBoard,
			int noOfCarromBoard, boolean gymnastics, boolean openGym, boolean badmintonCourt, int noOfBadmintonCourt,
			boolean cricketNet, int noOfCricketNet, double priceOfCarromBoard, boolean poleVault, boolean publicToilet,
			boolean longJumpCourt, int noOfLongJumpCourt, boolean highJumpCourt, int noOfHighJumpCourt, int noOfPlayers,
			int noOfMirrors, int noOfComodes, int noOfWashBasin, int noOfTaps, int noOfAdvertisementBoard,
			int noOfChairs, double priceOfChair, boolean commentryBox, int noOfCommentators, int ageOfCommentator) {
		super();
		this.type = type;
		this.name = name;
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.priceOfHighmast = priceOfHighmast;
		this.noOfOpenGymEquipments = noOfOpenGymEquipments;
		this.noHighmast = noHighmast;
		this.basketBall = basketBall;
		this.crowdCapacity = crowdCapacity;
		this.noOfGates = noOfGates;
		this.entryFees = entryFees;
		this.runningTrack = runningTrack;
		this.kabaddiCourt = kabaddiCourt;
		this.javelineThrow = javelineThrow;
		this.noOfBuilding = noOfBuilding;
		this.tableTennisCourt = tableTennisCourt;
		this.noOfTableTennisCourt = noOfTableTennisCourt;
		this.carromBoard = carromBoard;
		this.noOfCarromBoard = noOfCarromBoard;
		this.gymnastics = gymnastics;
		this.openGym = openGym;
		this.badmintonCourt = badmintonCourt;
		this.noOfBadmintonCourt = noOfBadmintonCourt;
		this.cricketNet = cricketNet;
		this.noOfCricketNet = noOfCricketNet;
		this.priceOfCarromBoard = priceOfCarromBoard;
		this.poleVault = poleVault;
		this.publicToilet = publicToilet;
		this.longJumpCourt = longJumpCourt;
		this.noOfLongJumpCourt = noOfLongJumpCourt;
		this.highJumpCourt = highJumpCourt;
		this.noOfHighJumpCourt = noOfHighJumpCourt;
		this.noOfPlayers = noOfPlayers;
		this.noOfMirrors = noOfMirrors;
		this.noOfComodes = noOfComodes;
		this.noOfWashBasin = noOfWashBasin;
		this.noOfTaps = noOfTaps;
		this.noOfAdvertisementBoard = noOfAdvertisementBoard;
		this.noOfChairs = noOfChairs;
		this.priceOfChair = priceOfChair;
		this.commentryBox = commentryBox;
		this.noOfCommentators = noOfCommentators;
		this.ageOfCommentator = ageOfCommentator;
	}

	@Override
	public int hashCode() {
		return 410;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof StadiumDTO) {
				StadiumDTO casted = (StadiumDTO) obj;
				if (casted.country.equals(this.country)
						&& (casted.city.equals(this.city) && (casted.name.equals(this.name)
								&& (casted.state.equals(this.state) && (casted.type.equals(this.type)))))) {
					System.out.println("Both are same");
				}
			} else {
				System.out.println("Both are not same");
			}
		}

		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "StadiumDTO [type=" + type + ", name=" + name + ", country=" + country + ", state=" + state + ", city="
				+ city + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public double getPriceOfHighmast() {
		return priceOfHighmast;
	}

	public void setPriceOfHighmast(double priceOfHighmast) {
		this.priceOfHighmast = priceOfHighmast;
	}

	public int getNoOfOpenGymEquipments() {
		return noOfOpenGymEquipments;
	}

	public void setNoOfOpenGymEquipments(int noOfOpenGymEquipments) {
		this.noOfOpenGymEquipments = noOfOpenGymEquipments;
	}

	public int getNoHighmast() {
		return noHighmast;
	}

	public void setNoHighmast(int noHighmast) {
		this.noHighmast = noHighmast;
	}

	public boolean isBasketBall() {
		return basketBall;
	}

	public void setBasketBall(boolean basketBall) {
		this.basketBall = basketBall;
	}

	public int getCrowdCapacity() {
		return crowdCapacity;
	}

	public void setCrowdCapacity(int crowdCapacity) {
		this.crowdCapacity = crowdCapacity;
	}

	public int getNoOfGates() {
		return noOfGates;
	}

	public void setNoOfGates(int noOfGates) {
		this.noOfGates = noOfGates;
	}

	public double getEntryFees() {
		return entryFees;
	}

	public void setEntryFees(double entryFees) {
		this.entryFees = entryFees;
	}

	public boolean isRunningTrack() {
		return runningTrack;
	}

	public void setRunningTrack(boolean runningTrack) {
		this.runningTrack = runningTrack;
	}

	public boolean isKabaddiCourt() {
		return kabaddiCourt;
	}

	public void setKabaddiCourt(boolean kabaddiCourt) {
		this.kabaddiCourt = kabaddiCourt;
	}

	public boolean isJavelineThrow() {
		return javelineThrow;
	}

	public void setJavelineThrow(boolean javelineThrow) {
		this.javelineThrow = javelineThrow;
	}

	public int getNoOfBuilding() {
		return noOfBuilding;
	}

	public void setNoOfBuilding(int noOfBuilding) {
		this.noOfBuilding = noOfBuilding;
	}

	public boolean isTableTennisCourt() {
		return tableTennisCourt;
	}

	public void setTableTennisCourt(boolean tableTennisCourt) {
		this.tableTennisCourt = tableTennisCourt;
	}

	public int getNoOfTableTennisCourt() {
		return noOfTableTennisCourt;
	}

	public void setNoOfTableTennisCourt(int noOfTableTennisCourt) {
		this.noOfTableTennisCourt = noOfTableTennisCourt;
	}

	public boolean isCarromBoard() {
		return carromBoard;
	}

	public void setCarromBoard(boolean carromBoard) {
		this.carromBoard = carromBoard;
	}

	public int getNoOfCarromBoard() {
		return noOfCarromBoard;
	}

	public void setNoOfCarromBoard(int noOfCarromBoard) {
		this.noOfCarromBoard = noOfCarromBoard;
	}

	public boolean isGymnastics() {
		return gymnastics;
	}

	public void setGymnastics(boolean gymnastics) {
		this.gymnastics = gymnastics;
	}

	public boolean isOpenGym() {
		return openGym;
	}

	public void setOpenGym(boolean openGym) {
		this.openGym = openGym;
	}

	public boolean isBadmintonCourt() {
		return badmintonCourt;
	}

	public void setBadmintonCourt(boolean badmintonCourt) {
		this.badmintonCourt = badmintonCourt;
	}

	public int getNoOfBadmintonCourt() {
		return noOfBadmintonCourt;
	}

	public void setNoOfBadmintonCourt(int noOfBadmintonCourt) {
		this.noOfBadmintonCourt = noOfBadmintonCourt;
	}

	public boolean isCricketNet() {
		return cricketNet;
	}

	public void setCricketNet(boolean cricketNet) {
		this.cricketNet = cricketNet;
	}

	public int getNoOfCricketNet() {
		return noOfCricketNet;
	}

	public void setNoOfCricketNet(int noOfCricketNet) {
		this.noOfCricketNet = noOfCricketNet;
	}

	public double getPriceOfCarromBoard() {
		return priceOfCarromBoard;
	}

	public void setPriceOfCarromBoard(double priceOfCarromBoard) {
		this.priceOfCarromBoard = priceOfCarromBoard;
	}

	public boolean isPoleVault() {
		return poleVault;
	}

	public void setPoleVault(boolean poleVault) {
		this.poleVault = poleVault;
	}

	public boolean isPublicToilet() {
		return publicToilet;
	}

	public void setPublicToilet(boolean publicToilet) {
		this.publicToilet = publicToilet;
	}

	public boolean isLongJumpCourt() {
		return longJumpCourt;
	}

	public void setLongJumpCourt(boolean longJumpCourt) {
		this.longJumpCourt = longJumpCourt;
	}

	public int getNoOfLongJumpCourt() {
		return noOfLongJumpCourt;
	}

	public void setNoOfLongJumpCourt(int noOfLongJumpCourt) {
		this.noOfLongJumpCourt = noOfLongJumpCourt;
	}

	public boolean isHighJumpCourt() {
		return highJumpCourt;
	}

	public void setHighJumpCourt(boolean highJumpCourt) {
		this.highJumpCourt = highJumpCourt;
	}

	public int getNoOfHighJumpCourt() {
		return noOfHighJumpCourt;
	}

	public void setNoOfHighJumpCourt(int noOfHighJumpCourt) {
		this.noOfHighJumpCourt = noOfHighJumpCourt;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public int getNoOfMirrors() {
		return noOfMirrors;
	}

	public void setNoOfMirrors(int noOfMirrors) {
		this.noOfMirrors = noOfMirrors;
	}

	public int getNoOfComodes() {
		return noOfComodes;
	}

	public void setNoOfComodes(int noOfComodes) {
		this.noOfComodes = noOfComodes;
	}

	public int getNoOfWashBasin() {
		return noOfWashBasin;
	}

	public void setNoOfWashBasin(int noOfWashBasin) {
		this.noOfWashBasin = noOfWashBasin;
	}

	public int getNoOfTaps() {
		return noOfTaps;
	}

	public void setNoOfTaps(int noOfTaps) {
		this.noOfTaps = noOfTaps;
	}

	public int getNoOfAdvertisementBoard() {
		return noOfAdvertisementBoard;
	}

	public void setNoOfAdvertisementBoard(int noOfAdvertisementBoard) {
		this.noOfAdvertisementBoard = noOfAdvertisementBoard;
	}

	public int getNoOfChairs() {
		return noOfChairs;
	}

	public void setNoOfChairs(int noOfChairs) {
		this.noOfChairs = noOfChairs;
	}

	public double getPriceOfChair() {
		return priceOfChair;
	}

	public void setPriceOfChair(double priceOfChair) {
		this.priceOfChair = priceOfChair;
	}

	public boolean isCommentryBox() {
		return commentryBox;
	}

	public void setCommentryBox(boolean commentryBox) {
		this.commentryBox = commentryBox;
	}

	public int getNoOfCommentators() {
		return noOfCommentators;
	}

	public void setNoOfCommentators(int noOfCommentators) {
		this.noOfCommentators = noOfCommentators;
	}

	public int getAgeOfCommentator() {
		return ageOfCommentator;
	}

	public void setAgeOfCommentator(int ageOfCommentator) {
		this.ageOfCommentator = ageOfCommentator;
	}

}
