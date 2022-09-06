class ShirtRunner
{
public static void main(String [] args)
{
    String brand=Shirt.brand;
	{
	System.out.println("The Brand of shirt is "+"\t"+brand);
    }
	String color=Shirt.color;
	{
	System.out.println("The Shirt color is "+"\t"+color);
    }
		Shirt.setLength();
		// {
			// //int lenght1=Shirt.lenght;
		// System.out.println(lenght);
	Shirt.setLength(40);
	Shirt.cost=800;
	{
		System.out.println(Shirt.cost);
	}
	
}
}