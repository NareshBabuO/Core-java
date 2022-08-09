class Mobile
{
	static String brand;
	static String color;
	static int ram;
	static double cost=13000;
	
	static 
	{
		brand="POCO";
	}
	static void setColor()
	{
		color="black";
		System.out.println("The color of mobile is"+"\t"+ color);
	}
	static void setColor(String value)
	{
		color=value;
		System.out.println("The 2nd Color of pen is "+"\t" + color);
	}
}