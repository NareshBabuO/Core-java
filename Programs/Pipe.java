class Pipe
{
static String brand;
static String color="black";
static  double lenght;
static int cost;

static
{
brand="Adishwar";
}
static void setLenght()
{
lenght=35.5;
System.out.println("the Lenght of pipe is "+lenght);
}
static void setLenght(double value)
{
lenght=value;
System.out.println("The lenght of pipe we brought is"+lenght);
}
}

