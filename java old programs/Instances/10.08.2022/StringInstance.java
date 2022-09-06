class StringInstance
{
   String name="Shedharth nandan Sahoo";
   String name1="Aditya";
   
   char nm=name.charAt(12);
   int nm1=name.codePointAt(6);
   int nm2=name.codePointBefore(13);
   int nm3=name.codePointCount(7,12);
   int nm4=name.compareTo("Sahoo");
   int nm5=name.compareToIgnoreCase("nandan");
   String nm6=name.concat(" ");
   boolean nm7=name.contains("z");//false
   boolean nm8=name.contains("d");
   boolean nm9=name.contentEquals("Sh");
   boolean nm10=name.contentEquals("nan");
   boolean nm11=name.endsWith("oo");
   boolean nm12=name.equals("nandan");
//   boolean nm13=name1.equalsIngnoreCase("adithya");
   int nm14=name1.hashCode();
   int nm15=name1.indexOf(5);
   int nm16=name.length();
   boolean nm17=name.isEmpty();
   String nm18=name1.replace("A","S");
   boolean nm19=name1.startsWith("A");
  // String nm20=name.substring(A);
  String nm21=name1.toLowerCase();
  String nm22=name1.toUpperCase();
   String nm23=name.trim();
   
   
   
   
   public static void main (String [] args)
   {
	  StringInstance si=new StringInstance();
	  
	  System.out.println(si.nm);
	  System.out.println(si.nm1);
	  System.out.println(si.nm2);
	  System.out.println(si.nm3);
	  System.out.println(si.nm4);
	  System.out.println(si.nm5);
	  System.out.println(si.nm6);
	  System.out.println(si.nm7);
	  System.out.println(si.nm8);
	  System.out.println(si.nm9);
	  System.out.println(si.nm10);
	   System.out.println(si.nm11);
	    System.out.println(si.nm12);
	//	System.out.println(si.nm13);
	System.out.println(si.nm14);
	System.out.print(si.nm15);
	System.out.println(si.nm16);
	System.out.println(si.nm17);
	System.out.println(si.nm18);
	System.out.println(si.nm19);
	//System.out.println(si.nm20);
	System.out.println(si.nm21);
	System.out.println(si.nm22);
	System.out.println(si.nm23);
	
	  
	  
   }
}