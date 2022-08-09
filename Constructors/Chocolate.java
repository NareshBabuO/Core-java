class Chocolate
{
String name;
String flavour;
String brand;
int price;

Chocolate()
{
	System.out.println(" Default Constructor with 0 args");
}
Chocolate(String name)
{
	System.out.println("The Constructor with String args");
	this.name=name;
}
Chocolate(String name , String flavour)
{
	this(name);
	System.out.println("The Constructor with String , String ,args");
	this.flavour=flavour;
}
Chocolate(String name , String flavour, String brand)
{
	this(name,flavour);
	System.out.println("The Constructor with String , String ,String ,args");
	this.brand=brand;
}
Chocolate(String name , String flavour, String brand, int price)
{
	this(name,flavour,brand);
	System.out.println("The Constructor with String , String , String, args");
	this.price=price;
}
}	

