class Paint
{
static String company;
static  String color="bule";
static int total;
static double cost;


static 
{
company="asian paints";	
}
static void setTotal()
{
	total=3;
	System.out.println("The total paints need is" +"\t"+ total);
}
static void setTotal(int value)
{
	total=value;
	System.out.println("The total paints need is" +"\t"+ total);
}
}
