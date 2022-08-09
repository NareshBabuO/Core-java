class CarromBoard
{
static String dimension="74*74 mm ";
String brand;
int totalType;
int totalCoins;

CarromBoard()
{
	System.out.println("The CarromBoard Details is");
}
CarromBoard( String a1, int a2 , int a3)
{
	brand=a1;
	totalType=a2;
	totalCoins=a3;
	System.out.println("The CarromBoard Details inside Constrocts is");
}
}
