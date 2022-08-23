package com.xworkz.accessmodifier.sup;

public class AutoMobile {
	
		public String type;
		public String brand;
		
		public double sellAccesscories(String name) {
		
		if(name=="tyer") {
			System.out.println("the value of tyer is ");
			return 5000;}
			if (name=="Break") {
				System.out.println("The Value of Break is ");
				return  2000;
			}
			if (name=="Dome") {
				System.out.println("The value of dome is");
				return 4000;
			}
			if (name=="gearbox")
			{
				System.out.println("The value of gearbox is");
				return 10000;
			}else
			{
				System.out.println("The Value is");
			return 0;
		}
		}
			
			public void setType(String type)
			{
				this.type=type;
			}
			public void setBrand(String brand)
			{
				this.brand=brand;
		}
			protected void printData()
			{
				System.out.println(this.type);
				System.out.println(this.brand);
			}
}
