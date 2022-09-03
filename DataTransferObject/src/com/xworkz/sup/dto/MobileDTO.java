package com.xworkz.sup.dto;

public class MobileDTO {

	private String brand;
	private String model;
	private String color;
	private String owner;
	private String country;
	private String company;
	private String area;
	private String city;
	private String state;
	private String purchageFrom;
	private String paymentType;
	private String deliveryType;
	private String billname;
	private double cost;
	private int yearofmanufacture;
	private double weigth;
	private long imeNumber;
	private String shape;
	private String screenType;
	private int totalApps;
	private String slidingType;
	private double displaylenght;
	private String displaytype;
	private String backType;
	private String chargertype;
	private int manufacture1stMobile;
	private String model1;
	private String model2;
	private String model3;
	private String model4;
	private String model5;
	private String model6;
	private String model7;
	private String model8;
	private String model9;
	private String model10;
	private String model11;
	private String model12;
	private int costmodel1;
	private int costmodel2;
	private int costmodel3;
	private int costmodel4;
	private int costmodel5;
	private int costmodel6;
	private int costmodel7;
	private int costmodel8;
	private int costmodel9;
	private int costmodel10;
	private int costmodel11;
	private int costmodel12;

	public MobileDTO() {
	}

	public MobileDTO(String brand, String model, String color, String owner, String country, String company,
			String area, String city, String state, String purchageFrom, String paymentType, String deliveryType,
			String billname, double cost, int yearofmanufacture, double weigth, long imeNumber, String shape,
			String screenType, int totalApps, String slidingType, double displaylenght, String displaytype,
			String backType, String chargertype, int manufacture1stMobile, String model1, String model2, String model3,
			String model4, String model5, String model6, String model7, String model8, String model9, String model10,
			String model11, String model12, int costmodel1, int costmodel2, int costmodel3, int costmodel4,
			int costmodel5, int costmodel6, int costmodel7, int costmodel8, int costmodel9, int costmodel10,
			int costmodel11, int costmodel12) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.owner = owner;
		this.country = country;
		this.company = company;
		this.area = area;
		this.city = city;
		this.state = state;
		this.purchageFrom = purchageFrom;
		this.paymentType = paymentType;
		this.deliveryType = deliveryType;
		this.billname = billname;
		this.cost = cost;
		this.yearofmanufacture = yearofmanufacture;
		this.weigth = weigth;
		this.imeNumber = imeNumber;
		this.shape = shape;
		this.screenType = screenType;
		this.totalApps = totalApps;
		this.slidingType = slidingType;
		this.displaylenght = displaylenght;
		this.displaytype = displaytype;
		this.backType = backType;
		this.chargertype = chargertype;
		this.manufacture1stMobile = manufacture1stMobile;
		this.model1 = model1;
		this.model2 = model2;
		this.model3 = model3;
		this.model4 = model4;
		this.model5 = model5;
		this.model6 = model6;
		this.model7 = model7;
		this.model8 = model8;
		this.model9 = model9;
		this.model10 = model10;
		this.model11 = model11;
		this.model12 = model12;
		this.costmodel1 = costmodel1;
		this.costmodel2 = costmodel2;
		this.costmodel3 = costmodel3;
		this.costmodel4 = costmodel4;
		this.costmodel5 = costmodel5;
		this.costmodel6 = costmodel6;
		this.costmodel7 = costmodel7;
		this.costmodel8 = costmodel8;
		this.costmodel9 = costmodel9;
		this.costmodel10 = costmodel10;
		this.costmodel11 = costmodel11;
		this.costmodel12 = costmodel12;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not equal to null");
			if (obj instanceof MobileDTO) {
				MobileDTO casted = (MobileDTO) obj;
				if (casted.model.equals(this.model)
						&& (casted.brand.equals(this.brand) && (casted.color.equals(this.color)
								&& (casted.owner.equals(this.owner) && (casted.company.equals(this.company)
										&& (casted.chargertype.equals(this.chargertype))))))) {
					System.out.println("Both are same");
					return true;
				} else {
					System.out.println("Both are not same");
				}
			}else {
				System.out.println();
			}
		}
		return super.equals(obj);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPurchageFrom() {
		return purchageFrom;
	}

	public void setPurchageFrom(String purchageFrom) {
		this.purchageFrom = purchageFrom;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getBillname() {
		return billname;
	}

	public void setBillname(String billname) {
		this.billname = billname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getYearofmanufacture() {
		return yearofmanufacture;
	}

	public void setYearofmanufacture(int yearofmanufacture) {
		this.yearofmanufacture = yearofmanufacture;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public long getImeNumber() {
		return imeNumber;
	}

	public void setImeNumber(long imeNumber) {
		this.imeNumber = imeNumber;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}

	public int getTotalApps() {
		return totalApps;
	}

	public void setTotalApps(int totalApps) {
		this.totalApps = totalApps;
	}

	public String getSlidingType() {
		return slidingType;
	}

	public void setSlidingType(String slidingType) {
		this.slidingType = slidingType;
	}

	public double getDisplaylenght() {
		return displaylenght;
	}

	public void setDisplaylenght(double displaylenght) {
		this.displaylenght = displaylenght;
	}

	public String getDisplaytype() {
		return displaytype;
	}

	public void setDisplaytype(String displaytype) {
		this.displaytype = displaytype;
	}

	public String getBackType() {
		return backType;
	}

	public void setBackType(String backType) {
		this.backType = backType;
	}

	public String getChargertype() {
		return chargertype;
	}

	public void setChargertype(String chargertype) {
		this.chargertype = chargertype;
	}

	public int getManufacture1stMobile() {
		return manufacture1stMobile;
	}

	public void setManufacture1stMobile(int manufacture1stMobile) {
		this.manufacture1stMobile = manufacture1stMobile;
	}

	public String getModel1() {
		return model1;
	}

	public void setModel1(String model1) {
		this.model1 = model1;
	}

	public String getModel2() {
		return model2;
	}

	public void setModel2(String model2) {
		this.model2 = model2;
	}

	public String getModel3() {
		return model3;
	}

	public void setModel3(String model3) {
		this.model3 = model3;
	}

	public String getModel4() {
		return model4;
	}

	public void setModel4(String model4) {
		this.model4 = model4;
	}

	public String getModel5() {
		return model5;
	}

	public void setModel5(String model5) {
		this.model5 = model5;
	}

	public String getModel6() {
		return model6;
	}

	public void setModel6(String model6) {
		this.model6 = model6;
	}

	public String getModel7() {
		return model7;
	}

	public void setModel7(String model7) {
		this.model7 = model7;
	}

	public String getModel8() {
		return model8;
	}

	public void setModel8(String model8) {
		this.model8 = model8;
	}

	public String getModel9() {
		return model9;
	}

	public void setModel9(String model9) {
		this.model9 = model9;
	}

	public String getModel10() {
		return model10;
	}

	public void setModel10(String model10) {
		this.model10 = model10;
	}

	public String getModel11() {
		return model11;
	}

	public void setModel11(String model11) {
		this.model11 = model11;
	}

	public String getModel12() {
		return model12;
	}

	public void setModel12(String model12) {
		this.model12 = model12;
	}

	public int getCostmodel1() {
		return costmodel1;
	}

	public void setCostmodel1(int costmodel1) {
		this.costmodel1 = costmodel1;
	}

	public int getCostmodel2() {
		return costmodel2;
	}

	public void setCostmodel2(int costmodel2) {
		this.costmodel2 = costmodel2;
	}

	public int getCostmodel3() {
		return costmodel3;
	}

	public void setCostmodel3(int costmodel3) {
		this.costmodel3 = costmodel3;
	}

	public int getCostmodel4() {
		return costmodel4;
	}

	public void setCostmodel4(int costmodel4) {
		this.costmodel4 = costmodel4;
	}

	public int getCostmodel5() {
		return costmodel5;
	}

	public void setCostmodel5(int costmodel5) {
		this.costmodel5 = costmodel5;
	}

	public int getCostmodel6() {
		return costmodel6;
	}

	public void setCostmodel6(int costmodel6) {
		this.costmodel6 = costmodel6;
	}

	public int getCostmodel7() {
		return costmodel7;
	}

	public void setCostmodel7(int costmodel7) {
		this.costmodel7 = costmodel7;
	}

	public int getCostmodel8() {
		return costmodel8;
	}

	public void setCostmodel8(int costmodel8) {
		this.costmodel8 = costmodel8;
	}

	public int getCostmodel9() {
		return costmodel9;
	}

	public void setCostmodel9(int costmodel9) {
		this.costmodel9 = costmodel9;
	}

	public int getCostmodel10() {
		return costmodel10;
	}

	public void setCostmodel10(int costmodel10) {
		this.costmodel10 = costmodel10;
	}

	public int getCostmodel11() {
		return costmodel11;
	}

	public void setCostmodel11(int costmodel11) {
		this.costmodel11 = costmodel11;
	}

	public int getCostmodel12() {
		return costmodel12;
	}

	public void setCostmodel12(int costmodel12) {
		this.costmodel12 = costmodel12;
	}
	// (casted.model.equals(this.model)&&(casted.brand.equals(this.brand)&&(casted.color.equals(this.color)
	// &&(casted.owner.equals(this.owner)&&(casted.company.equals(this.company))))))

	@Override
	public String toString() {
		return "MobileDTO [brand=" + brand + ", model=" + model + ", color=" + color + ", owner=" + owner + ", company="
				+ company + ",company=" + company + "]";
	}

}
