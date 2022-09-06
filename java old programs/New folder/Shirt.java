class Shirt
{
static String brand="polo";
static String color;
static int length;
static double cost;


static
  {
  color="White";
  }
   static void setLength()
   {
      length=38;
	  System.out.println(length);
   }
    static void setLength(int value)
	{
		length=value;
	System.out.println(length);
    }
}	