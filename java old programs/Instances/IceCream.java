class IceCream
{
 String flavors;
    double price;
    String color;
    String brand;
    double quantity;
	  double weight;
    boolean dryFruit;
    boolean goodTaste;
    int since;

IceCream()
{
	System.out.println("Default constructor IceCream");
}
IceCream(String flavors)
{
	this();
	System.out.println("The Constructor with single Arg");
	this.flavors=flavors;
	
}
IceCream(String flavors, double price)
{
	
	this(flavors);
		//System.out.println("The Price of Ice Cream is");
		System.out.println("The Constructor with 2 Arg");
	
	this.price=price;

}
IceCream(String flavors, double price, String color)
{
	this(flavors,price);
	System.out.println("The Constructor with 3 Arg");
	
	this.color=color;
}
IceCream(String flavors, double price, String color, String brand)
{
	this(flavors,price,color);
	System.out.println("The Constructor with 4 Arg");
	this.brand=brand;
}
IceCream(String flavors, double price, String color, String brand , double quantity)
{
	this(flavors,price,color,brand);
	System.out.println("The Constructor with 5 Arg");

	this.quantity=quantity;
}
IceCream(String flavors, double price, String color, String brand , double quantity,double weight)
{
	this(flavors,price,color,brand,quantity);
	System.out.println("The Constructor with 6 Arg");
	
	this.weight=weight;
}
IceCream(String flavors, double price, String color, String brand , double quantity,double weight,boolean dryFruit)
{
	this(flavors,price,color,brand,quantity,weight);
	System.out.println("The Constructor with 7 Arg");
	
	this.dryFruit=dryFruit;
}
IceCream(String flavors, double price, String color, String brand , double quantity,double weight,boolean dryFruit, boolean goodTaste)
{
	this(flavors,price,color,brand,quantity,weight,dryFruit);
	System.out.println("The Constructor with 8 Arg");
	
	this.goodTaste=goodTaste;
}
IceCream(String flavors, double price, String color, String brand , double quantity,double weight,boolean dryFruit, boolean goodTaste, int since)
{
	this(flavors,price,color,brand,quantity,weight,dryFruit,goodTaste);
	System.out.println("The Constructor with 9 Arg");
	this.since=since;
}
}
	




	
	


	
	
        