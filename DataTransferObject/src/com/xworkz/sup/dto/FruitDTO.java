package com.xworkz.sup.dto;

public class FruitDTO {

	private String fruit1name;
	private String fruit2name;
	private String fruit3name;
	private String fruit4name;
	private double fruit1cost;
	private double fruit2cost;
	private double fruit3cost;
	private double fruit4cost;
	private String fruit1Teast;
	private String fruit2Teast;
	private String fruit3Teast;
	private String fruit4Teast;
	private String name;
	private double costPerKG;
	private String teast;
	private int totalKG;
	private String totalBread;
	private String type1name;
	private String type2name;
	private String type3name;
	private double type1Cost;
	private double type2Cost;
	private double type3Cost;
	private double type4Cost;
	private String highestGrowingState;
	private double calories;
	private int protein;
	private int finber;

	public FruitDTO() {
	}

	public FruitDTO(String fruit1name, String fruit2name, String fruit3name, String fruit4name, double fruit1cost,
			double fruit2cost, double fruit3cost, double fruit4cost, String fruit1Teast, String fruit2Teast,
			String fruit3Teast, String fruit4Teast, String name, double costPerKG, String teast, int totalKG,
			String totalBread, String type1name, String type2name, String type3name, double type1Cost, double type2Cost,
			double type3Cost, double type4Cost, String highestGrowingState, double calories, int protein, int finber) {
		super();
		this.fruit1name = fruit1name;
		this.fruit2name = fruit2name;
		this.fruit3name = fruit3name;
		this.fruit4name = fruit4name;
		this.fruit1cost = fruit1cost;
		this.fruit2cost = fruit2cost;
		this.fruit3cost = fruit3cost;
		this.fruit4cost = fruit4cost;
		this.fruit1Teast = fruit1Teast;
		this.fruit2Teast = fruit2Teast;
		this.fruit3Teast = fruit3Teast;
		this.fruit4Teast = fruit4Teast;
		this.name = name;
		this.costPerKG = costPerKG;
		this.teast = teast;
		this.totalKG = totalKG;
		this.totalBread = totalBread;
		this.type1name = type1name;
		this.type2name = type2name;
		this.type3name = type3name;
		this.type1Cost = type1Cost;
		this.type2Cost = type2Cost;
		this.type3Cost = type3Cost;
		this.type4Cost = type4Cost;
		this.highestGrowingState = highestGrowingState;
		this.calories = calories;
		this.protein = protein;
		this.finber = finber;
	}

	@Override
	public int hashCode() {
		return 50;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not equal to Null");
			if (obj instanceof FruitDTO) {
				FruitDTO casted = (FruitDTO) obj;
				if (casted.name.equals(this.name) && (casted.teast.equals(this.teast) && (casted.fruit1name
						.equals(this.fruit1cost)
						&& (casted.totalBread.equals(this.totalBread) && (casted.fruit1Teast.equals(this.fruit1cost)
								&& (casted.fruit2name.equals(this.fruit2name)
										&& (casted.fruit2Teast.equals(this.fruit2name)
												&& (casted.highestGrowingState.equals(this.highestGrowingState)
														&& (casted.fruit4name.equals(this.fruit4name)&&(casted.fruit4Teast.equals(this.fruit4Teast)&&
																(casted.fruit3name.equals(this.fruit3name)&&
																		(casted.fruit3Teast.equals(this.fruit3Teast))))))))))))) {
					System.out.println("Both are same");
					return true;
				} else {
					System.out.println("Both are not same");
				}
			}
		}
		return super.equals(obj);
	}

	public String getFruit1name() {
		return fruit1name;
	}

	public void setFruit1name(String fruit1name) {
		this.fruit1name = fruit1name;
	}

	public String getFruit2name() {
		return fruit2name;
	}

	public void setFruit2name(String fruit2name) {
		this.fruit2name = fruit2name;
	}

	public String getFruit3name() {
		return fruit3name;
	}

	public void setFruit3name(String fruit3name) {
		this.fruit3name = fruit3name;
	}

	public String getFruit4name() {
		return fruit4name;
	}

	public void setFruit4name(String fruit4name) {
		this.fruit4name = fruit4name;
	}

	public double getFruit1cost() {
		return fruit1cost;
	}

	public void setFruit1cost(double fruit1cost) {
		this.fruit1cost = fruit1cost;
	}

	public double getFruit2cost() {
		return fruit2cost;
	}

	public void setFruit2cost(double fruit2cost) {
		this.fruit2cost = fruit2cost;
	}

	public double getFruit3cost() {
		return fruit3cost;
	}

	public void setFruit3cost(double fruit3cost) {
		this.fruit3cost = fruit3cost;
	}

	public double getFruit4cost() {
		return fruit4cost;
	}

	public void setFruit4cost(double fruit4cost) {
		this.fruit4cost = fruit4cost;
	}

	public String getFruit1Teast() {
		return fruit1Teast;
	}

	public void setFruit1Teast(String fruit1Teast) {
		this.fruit1Teast = fruit1Teast;
	}

	public String getFruit2Teast() {
		return fruit2Teast;
	}

	public void setFruit2Teast(String fruit2Teast) {
		this.fruit2Teast = fruit2Teast;
	}

	public String getFruit3Teast() {
		return fruit3Teast;
	}

	public void setFruit3Teast(String fruit3Teast) {
		this.fruit3Teast = fruit3Teast;
	}

	public String getFruit4Teast() {
		return fruit4Teast;
	}

	public void setFruit4Teast(String fruit4Teast) {
		this.fruit4Teast = fruit4Teast;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCostPerKG() {
		return costPerKG;
	}

	public void setCostPerKG(double costPerKG) {
		this.costPerKG = costPerKG;
	}

	public String getTeast() {
		return teast;
	}

	public void setTeast(String teast) {
		this.teast = teast;
	}

	public int getTotalKG() {
		return totalKG;
	}

	public void setTotalKG(int totalKG) {
		this.totalKG = totalKG;
	}

	public String getTotalBread() {
		return totalBread;
	}

	public void setTotalBread(String totalBread) {
		this.totalBread = totalBread;
	}

	public String getType1name() {
		return type1name;
	}

	public void setType1name(String type1name) {
		this.type1name = type1name;
	}

	public String getType2name() {
		return type2name;
	}

	public void setType2name(String type2name) {
		this.type2name = type2name;
	}

	public String getType3name() {
		return type3name;
	}

	public void setType3name(String type3name) {
		this.type3name = type3name;
	}

	public double getType1Cost() {
		return type1Cost;
	}

	public void setType1Cost(double type1Cost) {
		this.type1Cost = type1Cost;
	}

	public double getType2Cost() {
		return type2Cost;
	}

	public void setType2Cost(double type2Cost) {
		this.type2Cost = type2Cost;
	}

	public double getType3Cost() {
		return type3Cost;
	}

	public void setType3Cost(double type3Cost) {
		this.type3Cost = type3Cost;
	}

	public double getType4Cost() {
		return type4Cost;
	}

	public void setType4Cost(double type4Cost) {
		this.type4Cost = type4Cost;
	}

	public String getHighestGrowingState() {
		return highestGrowingState;
	}

	public void setHighestGrowingState(String highestGrowingState) {
		this.highestGrowingState = highestGrowingState;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getFinber() {
		return finber;
	}

	public void setFinber(int finber) {
		this.finber = finber;
	}
//	if (casted.name.equals(this.name) && (casted.teast.equals(this.teast) && (casted.fruit1name
//			.equals(this.fruit1cost)
//			&& (casted.totalBread.equals(this.totalBread) && (casted.fruit1Teast.equals(this.fruit1cost)
//					&& (casted.fruit2name.equals(this.fruit2name)
//							&& (casted.fruit2Teast.equals(this.fruit2name)
//									&& (casted.highestGrowingState.equals(this.highestGrowingState)
//											&& (casted.fruit4name.equals(this.fruit4name)

	@Override
	public String toString() {
		return "FruitDTO [fruit1name=" + fruit1name + ", fruit2name=" + fruit2name + ", fruit4cost=" + fruit4cost
				+ ", fruit1Teast=" + fruit1Teast + ", fruit2Teast=" + fruit2Teast + ", fruit3Teast=" + fruit3Teast
				+ ", fruit4Teast=" + fruit4Teast + ", name=" + name + ", teast=" + teast + ", highestGrowingState="
				+ highestGrowingState + "]";
	}
}
