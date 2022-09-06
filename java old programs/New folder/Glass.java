class Glass
{
static String brand;
static String shape="square";
static double cost;
static int lenght;


static
{
brand="Fuso";
}
static void setCost()
{
cost=3000;
System.out.println("The Cost of Glass is"+cost);
}
static void setCost(double value)
{
cost=value;
System.out.println("The cost of glass we Brought is"+cost);
}
}

