class DateRunner
{
  public static void main(String[] dates)
  {
   Date date1 = new Date(31);
   System.out.println("The Date is"+"\t"+date1.day);
   System.out.println("*****************************"+"\n");
   
   Date month = new Date(31,8);
   System.out.println("The Date is"+"\t"+date1.day);
   System.out.println("The Month is "+"\t"+ month.month);
   System.out.println("*****************************"+"\n");
   
   Date year= new Date(31,8,1998);
   System.out.println("The Date is"+"\t"+date1.day);
   System.out.println("The Month is "+"\t"+ month.month);
   System.out.println("The year is "+"\t" + year.year);
   System.out.println("*****************************"+"\n");
   
   Date day= new Date(31,8,1998, "Monday");
   System.out.println("The Date is"+"\t"+date1.day);
    System.out.println("The Month is "+"\t"+ month.month);
   System.out.println("The year is "+"\t" + year.year);
   System.out.println("The day of "+"\t"+ day.dayInWord);
   System.out.println("*****************************"+"\n");
 
	  System.out.println("The Birthdate is "+ date1.day+"-"+month.month+"-"+year.year+"-"+day.dayInWord);
  }
  }