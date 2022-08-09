class PubRunner
{
  public static void main(String [] args)
  {
	  // String name;
  // String payMode;
  // double entryFee;
  
    Pub pub = new Pub();
	pub.name="Sherton";
	pub.payMode="Online";
	pub.entryFee=5500;
	System.out.println("The Pub is in "+"\t"+Pub.location);
	System.out.println("The Pub is name at"+"\t"+pub.name);
	System.out.println("The Payment Mode in Pub is"+"\t"+pub.payMode);
	System.out.println("The Entry fee in Pub Person is"+"\t"+pub.entryFee+"\n");
    
	 Pub pub1 = new Pub("Getlag","Online",3500);
	 System.out.println("The Pub is in "+"\t"+Pub.location);
	System.out.println("The Pub is name at"+"\t"+pub1.name);
	System.out.println("The Payment Mode in Pub is"+"\t"+pub1.payMode);
	System.out.println("The Entry fee in Pub Person is"+"\t"+pub1.entryFee+"\n");
	
	Pub pub2 = new Pub();
	pub2.name="Avon";
	pub2.payMode="Online & offline";
	pub2.entryFee=2500;
	 System.out.println("The Pub is in "+"\t"+Pub.location);
	System.out.println("The Pub is name at"+"\t"+pub2.name);
	System.out.println("The Payment Mode in Pub is"+"\t"+pub2.payMode);
	System.out.println("The Entry fee in Pub Person is"+"\t"+pub2.entryFee+"\n");
	
	Pub pub3 = new Pub("Gallo" , "offline", 3000);

	 System.out.println("The Pub is in "+"\t"+Pub.location);
	System.out.println("The Pub is name at"+"\t"+pub3.name);
	System.out.println("The Payment Mode in Pub is"+"\t"+pub3.payMode);
	System.out.println("The Entry fee in Pub Person is"+"\t"+pub3.entryFee+"\n");
	
	
	Pub pub4 = new Pub();
	pub4.name="Don't tell mama";
	pub4.payMode="Online & offline";
	pub4.entryFee=4000;
	 System.out.println("The Pub is in "+"\t"+Pub.location);
	System.out.println("The Pub is name at"+"\t"+pub4.name);
	System.out.println("The Payment Mode in Pub is"+"\t"+pub4.payMode);
	System.out.println("The Entry fee in Pub Person is"+"\t"+pub4.entryFee+"\n");

  }
}