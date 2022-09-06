class AtmRunner
{
public static void main(String [] args)
{
	// String bank;
  // String area;
  // String mainBranch;
  // byte personEntry;
  // String  street;
  // int InsideCamera;
  // double minDraw;
  // double MaxDraw;
Atm atm= new Atm();
 atm.bank="Katnataka";
 atm.area="Tumkur";
 atm.mainBranch="Mangalore";
 atm.street="Ashok nagar";
 atm.personEntry=1;
 atm.insideCamera=2;
 atm.minDraw=100.0;
 atm.maxDraw=10000;
 
	 System.out.println("The Atm Belongs to"+atm.bank);
	 System.out.println("The Atm Located in "+atm.area);
     System.out.println("The The main Branch of Atm/bank located in "+atm.mainBranch);
	 System.out.println("The Atm is in "+atm.street);
	 System.out.println("The total Person inside Atm is "+atm.personEntry);
	 System.out.println("The total Camera Present inside ATm is "+atm.insideCamera);
	 System.out.println("The minimum Amount to draw is "+atm.minDraw);
	  System.out.println("The Maximum Amount to draw is "+atm.maxDraw);
}
}
 