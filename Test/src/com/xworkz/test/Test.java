package com.xworkz.test;

public class Test {

	public static String name = "123";
	public static String name1 = "Hello";

	public static void main(String[] args) {
		System.out.println("3rd question answer is");
		int ti = Integer.parseInt("123");// 3
		System.out.println("The integer of a string is " + ti);

		System.out.println("1st question answer is");
		String name3 = "X-Workz"; // 1
		for (int BTM = name3.length(); BTM >= 0; BTM--) {
			System.out.println(BTM);
		}
		System.out.println("2nd question answer is");
		String name4 = "ShidarthnandanSahoo";
		char cha = 'n';
		int count = 0;
		for (int i = 0; i < name4.length(); i++) {
			if (name4.charAt(i) == cha)
				count++;
		}
		System.out.println(cha + "\t" + "Charactor is appers/repets total " + count + "times");
	}
}
