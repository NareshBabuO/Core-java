class ParkRunner
{
  public static void main(String [] args)
  { 
    Park park= new Park();
	park.name="Amanikere";
	park.area="Garden Road";
	park.city="Tumkur";
	park.noOftree=175;
	park.noOfbench=150;
	park.payMode="online";
	{
		System.out.println(park.name);
		System.out.println(park.area);
		System.out.println(park.area);
		System.out.println(park.city);
		System.out.println(park.noOftree);
		System.out.println(park.noOfbench);
		System.out.println(park.payMode);
	}
  }
}