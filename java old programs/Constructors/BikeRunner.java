class BikeRunner
{
public static void main(String[] args) 
{

 Bike bike=new Bike();
 bike.brand="yamaha";
 bike.cost=59000;
 bike.model=2015;
 bike.color="blue";
 bike.tierType="tubeless";
 //bike.tierCompany="MRF";
 bike.engine=125;
 {
 
        System.out.println(bike.brand);
 		System.out.println(bike.cost);
 		System.out.println(bike.model);
 		System.out.println(bike.color);
System.out.println(bike.tierType);
//System.out.println(bike.TierCompany);
 		System.out.println(bike.engine);
 }
}
}