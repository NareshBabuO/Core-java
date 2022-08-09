class BiscuitRunner
{
  public static void main(String [] args)
  {
	  // String brand;
// int price;
// double expiryDate;
// String manufactureBy
// int quantity;
// int noOfPieces;
// double weight;
	  Biscuit biscuit = new Biscuit();
	  biscuit.brand="Parle-G";
	  System.out.println("The Brand of Biscuit is"+"\t"+biscuit.brand+"\n");
	  
	  Biscuit biscuit1 = new Biscuit("Parle-G" , 20);
	  System.out.println("The Brand of Biscuit is"+"\t"+biscuit.brand);
	  System.out.println("The Price of Biscuit is"+ "\t"+biscuit1.price+"\n");
	  
	  Biscuit biscuit2= new Biscuit("Parle-G",20,2026);
	  System.out.println("The Brand of Biscuit is"+"\t"+biscuit.brand);
	  System.out.println("The Price of Biscuit is"+"\t"+ biscuit1.price);
	  System.out.println("The expiryDate of biscuit is"+"\t"+ biscuit2.expiryDate+"\n");
	  
	  Biscuit biscuit3 = new Biscuit("Parle-G",20,2026);
	  System.out.println("The Brand of Biscuit is"+"\t"+biscuit.brand);
	  System.out.println("The Price of Biscuit is"+"\t"+ biscuit1.price);
	  System.out.println("The expiryDate of biscuit is"+"\t"+ biscuit2.expiryDate);
	  
	  
	  Biscuit biscuit4 = new Biscuit("Parle-G",20,2026,"ParleAgro");
	  System.out.println("The Brand of Biscuit is"+"\t"+biscuit.brand);
	  System.out.println("The Price of Biscuit is"+"\t"+ biscuit1.price);
	  System.out.println("The expiryDate of biscuit is"+"\t"+ biscuit2.expiryDate);
	  System.out.println("The manufacture of biscuit is "+"\t"+ biscuit4.manufactureBy+"\n");
	  
	  Biscuit biscuit5 = new Biscuit("Parle-G",20,2026,"ParleAgro",5);
	   System.out.println("The Brand of Biscuit is"+"\t"+biscuit.brand);
	  System.out.println("The Price of Biscuit is"+"\t"+ biscuit1.price);
	  System.out.println("The expiryDate of biscuit is"+"\t"+ biscuit2.expiryDate);
	  System.out.println("The manufacture of biscuit is "+"\t"+ biscuit4.manufactureBy);
	  System.out.println("The quantity of Biscuit is "+"\t"+ biscuit5.quantity+"\n");
	  
	  
	   	  Biscuit biscuit6 = new Biscuit("Parle-G",20,2026,"ParleAgro",5,10);
		  System.out.println("The Brand of Biscuit is"+"\t"+biscuit.brand);
	  System.out.println("The Price of Biscuit is"+"\t"+ biscuit1.price);
	  System.out.println("The expiryDate of biscuit is"+"\t"+ biscuit2.expiryDate);
	  System.out.println("The manufacture of biscuit is "+"\t"+ biscuit4.manufactureBy);
	  System.out.println("The quantity of Biscuit is "+"\t"+ biscuit5.quantity);
	  System.out.println("The noOfPieces Biscuit is"+"\t" + biscuit6.noOfPieces+"\n");
	  
	  Biscuit biscuit7 = new Biscuit("Parle-G",20,2026,"ParleAgro",5,10,125);
	  System.out.println("The Brand of Biscuit is"+"\t"+biscuit.brand);
	  System.out.println("The Price of Biscuit is"+"\t"+ biscuit1.price);
	  System.out.println("The expiryDate of biscuit is"+"\t"+ biscuit2.expiryDate);
	  System.out.println("The manufacture of biscuit is "+"\t"+ biscuit4.manufactureBy);
	  System.out.println("The quantity of Biscuit is "+"\t"+ biscuit5.quantity);
	  System.out.println("The noOfPieces Biscuit is"+"\t" + biscuit6.noOfPieces);
	  System.out.println("The Weight of Biscuit is "+"\t"+ biscuit7.weight+"\n");
	  
  }
}  
	  
	  
	  