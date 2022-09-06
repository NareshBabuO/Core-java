class MobileRunner
{
public static void main(String [] args)
{
	String brand=Mobile.brand;
	{
		System.out.println("The Moblie Brand is "+ "\t"+brand);
	}
     Mobile.setColor();
	{
		String color=Mobile.color;
		//System.out.println("The type of pen color is"+ "\t" +color1);
	}
     //  Mobile.setColor=("blue");not working
	  Mobile.ram=6;
	  {
		  System.out.println("The Ram of the Mobile is "+"\t"+Mobile.ram+"GB");
	  }
	  double cost=Mobile.cost;
	  {
	  System.out.println("The Cost of mobile is "+ "\t"+ cost);
}
}
}