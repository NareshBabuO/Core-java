class SpeakerRunner
{
 public static  void main (String [] args)
 {
 // static String type="Lourder";
 // String brand;
 // int weight;
 // double cost;
 
 Speaker speaker=new Speaker();
 speaker.brand="Marshall";
 speaker.weight=1;
 speaker.cost=50000;
 System.out.println("The Speaker type is "+Speaker.type);
 System.out.println("The Speaker brand is "+ speaker.brand);
 System.out.println("The Speaker weight is  "+speaker.weight+"KG");
 System.out.println("The Speaker cost is "+speaker.cost+"\n");
 
 Speaker speaker1=new Speaker("Boat",750, 2000);
 System.out.println("The Speaker type is "+Speaker.type);
   System.out.println("The Speaker Brand is" +speaker1.brand);
   System.out.println("The Speaker Weight is "+speaker1.weight+"grams");
   System.out.println("The Speaker Cost is "+ speaker1.cost+"\n");
   
    Speaker speaker2=new Speaker();
 speaker.brand="JBL";
 speaker.weight=1;
 speaker.cost=2000;
 System.out.println("The Speaker type is "+Speaker.type);
 System.out.println("The Speaker brand is "+ speaker.brand);
 System.out.println("The Speaker weight is  "+speaker.weight+"KG");
 System.out.println("The Speaker cost is "+speaker.cost+"\n");
 
 Speaker speaker3=new Speaker("Sony",250, 1000);
 System.out.println("The Speaker type is "+Speaker.type);
   System.out.println("The Speaker Brand is" +speaker3.brand);
   System.out.println("The Speaker Weight is "+speaker3.weight+"grams");
   System.out.println("The Speaker Cost is "+ speaker3.cost+"\n");
   
   Speaker speaker4=new Speaker("Boat",750, 2000);
   Speaker.type="DJ";
 System.out.println("The Speaker type is "+Speaker.type);
   System.out.println("The Speaker Brand is" +speaker4.brand);
   System.out.println("The Speaker Weight is "+speaker4.weight+"grams");
   System.out.println("The Speaker Cost is "+ speaker4.cost+"\n");
   
   
   
 }
}