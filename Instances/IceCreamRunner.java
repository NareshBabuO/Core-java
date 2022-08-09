class IceCreamRunner
{
 public static void main(String [] values)
 {  
    // String flavors;
    // double price;
    // String color;
    // String brand;
    // double quantity;
	// double weight;
    // boolean dryFruit;
    // boolean goodTaste;
    // int since;
	 IceCream ice=new IceCream("ButterScoch");
	 System.out.println("The Flavor of IceCream is"+"\t"+ice.flavors);
	 System.out.println("*****************************"+"\n");
	 
	 IceCream ice1=new IceCream("ButterScoch",350);
	  System.out.println("The Flavor of IceCream is"+"\t"+ice.flavors);
	  System.out.println("The price of IceCream is"+"\t"+ice1.price); 
	  System.out.println("*****************************"+"\n");
	  
	  IceCream ice2=new IceCream("ButterScoch",350,"Gold");
	  System.out.println("The Flavor of IceCream is"+"\t"+ice.flavors);
	  System.out.println("The price of IceCream is"+"\t"+ice1.price);
      System.out.println("The color of IceCream is "+"\t"+ ice2.color);
	   System.out.println("*****************************"+"\n");
	  
	  IceCream ice3 = new IceCream("ButterScoch",350,"Gold","Ibaco");
	  System.out.println("The Flavor of IceCream is"+"\t"+ice.flavors);
	  System.out.println("The price of IceCream is"+"\t"+ice1.price);
      System.out.println("The color of IceCream is "+"\t"+ ice2.color);
	  System.out.println("The Brand of IceCreamis "+"\t"+ ice3.brand);
	   System.out.println("*****************************"+"\n");
	  
	  IceCream ice4 = new IceCream("ButterScoch",350,"Gold","Ibaco",7);
	  System.out.println("The Flavor of IceCream is"+"\t"+ice.flavors);
	  System.out.println("The price of IceCream is"+"\t"+ice1.price);
      System.out.println("The color of IceCream is "+"\t"+ ice2.color);
	  System.out.println("The Brand of IceCreamis "+"\t"+ ice3.brand);
	  System.out.println("The quantity of IceCreamis "+"\t"+ ice4.quantity);
	   System.out.println("*****************************"+"\n");
	  
	   IceCream ice5 = new IceCream("ButterScoch",350,"Gold","Ibaco",7,750);
	  System.out.println("The Flavor of IceCream is"+"\t"+ice.flavors);
	  System.out.println("The price of IceCream is"+"\t"+ice1.price);
      System.out.println("The color of IceCream is "+"\t"+ ice2.color);
	  System.out.println("The Brand of IceCream is "+"\t"+ ice3.brand);
	  System.out.println("The quantity of IceCream is "+"\t"+ ice4.quantity);
	  System.out.println("The weight of IceCream is "+"\t" + ice5.weight);
	   System.out.println("*****************************"+"\n");
	  
	  
	  IceCream ice6 = new IceCream("ButterScoch",350,"Gold","Ibaco",7,750,true);
	  System.out.println("The Flavor of IceCream is"+"\t"+ice.flavors);
	  System.out.println("The price of IceCream is"+"\t"+ice1.price);
      System.out.println("The color of IceCream is "+"\t"+ ice2.color);
	  System.out.println("The Brand of IceCream is "+"\t"+ ice3.brand);
	  System.out.println("The quantity of IceCream is "+"\t"+ ice4.quantity);
	  System.out.println("The weight of IceCream is "+"\t" + ice5.weight);
	  System.out.println("The IceCream have dryFruit"+"\t"+ ice6.dryFruit);
	   System.out.println("*****************************"+"\n");
	  
	  	  IceCream ice7 = new IceCream("ButterScoch",350,"Gold","Ibaco",7,750,true,true);
	  System.out.println("The Flavor of IceCream is"+"\t"+ice.flavors);
	  System.out.println("The price of IceCream is"+"\t"+ice1.price);
      System.out.println("The color of IceCream is "+"\t"+ ice2.color);
	  System.out.println("The Brand of IceCream is "+"\t"+ ice3.brand);
	  System.out.println("The quantity of IceCream is "+"\t"+ ice4.quantity);
	  System.out.println("The weight of IceCream is "+"\t" + ice5.weight);
	  System.out.println("The IceCream have dryFruit"+"\t"+ ice6.dryFruit);
	  System.out.println("The IceCream have dryFruit"+"\t"+ ice7.goodTaste);
	   System.out.println("*****************************"+"\n");
		
		
			  	  IceCream ice8 = new IceCream("ButterScoch",350,"Gold","Ibaco",7,750,true,true,1975);
	  System.out.println("The Flavor of IceCream is"+"\t"+ice.flavors);
	  System.out.println("The price of IceCream is"+"\t"+ice1.price);
      System.out.println("The color of IceCream is "+"\t"+ ice2.color);
	  System.out.println("The Brand of IceCream is "+"\t"+ ice3.brand);
	  System.out.println("The quantity of IceCream is "+"\t"+ ice4.quantity);
	  System.out.println("The weight of IceCream is "+"\t" + ice5.weight);
	  System.out.println("The IceCream have dryFruit"+"\t"+ ice6.dryFruit);
	  System.out.println("The IceCream have dryFruit"+"\t"+ ice7.goodTaste);
      System.out.println("The IceCream have dryFruit"+"\t"+ ice8.since);

	  
	  
	  
	  
	  
	  
	  
	   

	 
 }
}