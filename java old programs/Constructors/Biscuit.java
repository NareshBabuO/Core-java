class Biscuit
{
String brand;
int price;
double expiryDate;
String manufactureBy;
int quantity;
int noOfPieces;
int weight;

Biscuit()
{
	System.out.println("Default Constructor");
}
Biscuit(String brand)
{
	System.out.println("Constructor with Single args");
	this.brand=brand;
}
Biscuit(String brand , int price)
{
	this(brand);
	System.out.println("Constructor with 2 args");
	this.price=price;
}
Biscuit(String brand , int price , double expiryDate)
{
	this(brand,price);
	System.out.println("Constructor with 3 args");
	this.expiryDate=expiryDate;
}
Biscuit(String brand , int price , double expiryDate,String manufactureBy)
{
	this(brand,price,expiryDate);
	System.out.println("Constructor with 4 args");
	this.manufactureBy=manufactureBy;
}
Biscuit(String brand , int price , double expiryDate,  String manufactureBy , int quantity)
{
this(brand,price,expiryDate,manufactureBy);
System.out.println("Constructor with 5 arg");
this.quantity=quantity;
}
Biscuit(String brand , int price , double expiryDate,  String manufactureBy , int quantity , int noOfPieces)
{
	this(brand ,price,expiryDate,manufactureBy,quantity);
	System.out.println("Constructor with 5 arg");
	this.noOfPieces=noOfPieces;
}
Biscuit(String brand , int price , double expiryDate,  String manufactureBy , int quantity , int noOfPieces, int weight)
{
	this(brand ,price,expiryDate,manufactureBy,quantity,noOfPieces);
	System.out.println("Constructor with 6 arg");
	this.weight=weight;
}
	
}