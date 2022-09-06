
class StringStaticMethods{
	
	public static void main(String[] args){
		
		char[] data = {'a','d','h','i','t','h','y','a'};
		String str = String.copyValueOf(data);
		System.out.println(str);
		
		String str1 = String.valueOf(true);
		System.out.println(str1);
		
		String str2 = String.valueOf(data);
		System.out.println(str2);
		
		String str3 = String.valueOf(data,1,2);
		System.out.println(str3);
		
		String str4 = String.valueOf(345);
		System.out.println(str4);
	}
}