class HospitalRunner
{
 public static void main (String [] sergery)
  {
	 
	 String [] eqip={"Defibrillators", "patient monitors", "surgical tables"}; //"anesthesia machines", "sterilizers", "lights", "ultrasounds","electrosurgical units"};
	 
	 Founder founder = new Founder("Shidarth","tumkur",1970,Profession.DOCTOR);
	 founder.setIncome(8000000);
	founder.printData();
	
	
	Hospital hospital=new Hospital("Sidharta Hospital",2500,founder,Sepcilaization.HEART,eqip);
	hospital.printData();

 }
 
}

