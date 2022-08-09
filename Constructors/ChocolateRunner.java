class ChocolateRunner
{
  public static void main(String [] args)
  {
	  // String name;
// String flavour;
// String brand;
// int price;
	  Chocolate chololate = new Chocolate();
	  chololate.name="Kitkat";
	  System.out.println("The name of Chocolate is"+"\t"+chololate.name+"\n");
	  
	  Chocolate chololate1 = new Chocolate("Kitkat","Wafer");
	  System.out.println("The name of Chocolate is"+"\t"+chololate.name);
	  System.out.println("The flavour of Chocolate is"+"\t"+chololate1.flavour+"\n");
	  
	  Chocolate chololate2 = new Chocolate("Kitkat","Wafer","Neslet");
	  System.out.println("The name of Chocolate is"+"\t"+chololate.name);
	  System.out.println("The flavour of Chocolate is"+"\t"+chololate1.flavour);
	  System.out.println("The brand of Chocolate is "+"\t" + chololate2.brand+"\n");
	  
	  Chocolate chololate3 = new Chocolate("Kitkat","Wafer","Neslet",35);
	  System.out.println("The name of Chocolate is"+"\t"+chololate.name);
	  System.out.println("The flavour of Chocolate is"+"\t"+chololate1.flavour);
	  System.out.println("The brand of Chocolate is "+"\t" + chololate2.brand);
	  System.out.println("The price of Chocolate is"+"\t"+chololate3.price);
  }
}
	  
	  
	  
	  
	  
	  