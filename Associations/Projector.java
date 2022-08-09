class Projector
{
 String type;//con
 double cost;//con
 String[] brand;//Method
 String  quality;//me
 
 
 Projector(String type , double cost)
 {
	 this.type=type;
	 this.cost=cost;
 }
 void setQuality(String quality)
 {
	 this.quality=quality;
 }
 void getArray(String [] pjb)
 {
	 this.brand=pjb;
 }
 void printData()
 {
	 System.out.println("The Type of Projector is "+ this.type);
	 System.out.println("The cost of Projector is "+this.cost);
	 System.out.println("The quality of the projector is "+this.quality);
	 
	 for (int bn=0; bn<this.brand.length ; bn++)
	 {
		 System.out.println("The Brands of the Projector is "+ this.brand[bn]);
	 }
 }
}
 
 
 
 
 