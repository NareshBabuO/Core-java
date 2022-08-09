class MetroRunner
{
 public static void main(String [] args)
 { 
 	// String name;
// String location;
// String mode;
// int cost;
// String startAt;
// String endsAt;
// String paymentType;
// int totalDistance
        Metro metro=new Metro();
		metro.name="Namma metro";
		metro.location="Bangalore";
		metro.mode="coin";
		metro.startAt="Nagasandra";
		metro.endsAt="Konanakunte";
		metro.paymentType="Online";
		metro.totalDistance=26;
		metro.cost=120;
		System.out.println(metro.name);
		System.out.println(metro.location);
		System.out.println(metro.mode);
		System.out.println(metro.startAt);
		System.out.println(metro.endsAt);
		System.out.println(metro.paymentType);
		System.out.println(metro.totalDistance);
		System.out.println(metro.cost);
 }
}
 