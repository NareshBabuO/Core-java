class StringConstructor{
	
	public static void main(String[] agrs){
		
		String str = new String();
		System.out.println(str);
		
		byte[] bt = {12,76,97,67};
		String str1 = new String(bt);
		System.out.println(str1);
	
		byte[] bt2 = {7,3,4,6};
		String str3 = new String(bt2,1,2);
		System.out.println(str3);
		

		char[] value = {'a','d','i','t','h','y','a'};
		String str4 = new String(value);
		System.out.println(str4);
		
		char[] val = {'a','d','i'};
		String str5 = new String(val,0,1);
		System.out.println(str5);
		
		int[] cp = {1,2,5,8,7};
		String str6 = new String(cp,1,2);
		System.out.println(str6);
	
		String str7 = new String("Naresh");
		System.out.println(str7);
		
		StringBuffer sb = new StringBuffer("Naresh");
		String str8 = new String(sb);
		System.out.println(str8);

		StringBuilder builder = new StringBuilder("Darling");
		String str9 = new String(builder);
		System.out.println(str9);
	}
}