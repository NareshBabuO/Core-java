class ProjectorRunner
{
 public static void main(String [] values)
 {
	 String [] pjb= {"Epson", "BenQ","Optomo"};
	 
	 Projector pj = new Projector("*Home Teater" ,6000);
	 pj.setQuality("4k");
	 pj.getArray(pjb);
	 pj.printData();
 }
}
	 

	 