class Date 
{
        int day;
        int month;
        int year;
        String dayInWord;
		
		Date()
		{
			System.out.println("The Default Constructor date ");
		}
		Date(int day)
		{
			this();
			System.out.println("The int Constructor");
			this.day=day;
			System.out.println(day);
		}
		Date(int day , int month)
		{ 
		this(day);
		  System.out.println("The int , int Constructor");
			this.month=month;
			System.out.println("month");
			
		}	
		Date(int day , int month , int year)
		{
			this(day, month);
			System.out.println("The int , int, int Constructor");
			this.year=year;
			System.out.println(year);
		}
		Date(int day , int month , int year , String dayInWord)
		{
			this(day,month,year);
			System.out.println("The int , int , int , String Constructor");
			this.dayInWord=dayInWord;
			System.out.println(dayInWord);
		}	
}
        