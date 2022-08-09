class PhotoFrames
{
	String shopName;
  int size;
   Colors[] color;
  Types[] frame;
 
 PhotoFrames ( String shopName, Colors[] Color)
 {
	 this.shopName=shopName;
	 this.color=Color;
 }
 void setSize( int size)
 {
	 this.size=size;
 }
 // void setColor(Colors [] Color)
 // {
	 // this.color=Color;
 // }
 void setFrame(Types[] Frame)
 {
	 this.frame=Frame;
 }
 void printData()
 {
	 System.out.println("The Shop name of PhotoFrame is " +this.shopName);
	 System.out.println("The size of The PhotoFrame is " + this.size);
	 
	 for ( int co=0; co<this.color.length; co++)
	 {
		 System.out.println(this.color[co]);
	 }
	 for ( int fm=0; fm<this.frame.length; fm++)
	 {
		System.out.println(this.frame[fm]);
	 }
 }
	 
 }
 
 