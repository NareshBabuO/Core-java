class BridgeRunner
{
 public static void main(String [] args)
 {

	 Bridge bridge=new Bridge();//"BTM", "Bangalore", "Metro", "double", "deccan", "TMT 555", 2, 300000)
	 bridge.area="BTM";
	 bridge.city="Bangalore";
	 bridge.type="Metro";
	 bridge.mode="double";
	 bridge.cementName="deccan";
	 bridge.ironName="TMT 555";
	 bridge.km=2;
	 bridge.cost=300000;
	 System.out.println(bridge.area);
	 System.out.println(bridge.city);
	 System.out.println(bridge.type);
	 System.out.println(bridge.mode);
	 System.out.println(bridge.cementName);
	 System.out.println(bridge.ironName);
	 System.out.println(bridge.km);
	 System.out.println(bridge.cost);
 }
}