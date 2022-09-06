class ComputerRunner
{
public static void main(String [] args)
{
	String brand=Computer.brand;
	{
	System.out.println("The Brand of my computer is "+ Computer.brand);
	  }
   String color=Computer.color;
	    {
 	  System.out.println("The Brand of my computer is "+Computer.color);
        }
	    Computer.setRam();
	   {
		   int ram1=Computer.ram;
		 System.out.println("The Ram  of my computer is "+ram1);
    }
	Computer.setRam(5);
   Computer.cost=54300;
   {
	   System.out.println("The Value of my computer is"+"\t" +Computer.cost);
   }
   
}

}
	 