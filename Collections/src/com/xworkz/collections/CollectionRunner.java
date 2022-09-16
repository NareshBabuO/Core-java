package com.xworkz.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionRunner {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Shidharth");
		list.add("nandan");
		list.add("sashoo");
		list.add("Naresh");
		list.add("MSD");

		System.out.println(list);
		list.remove(3);

		boolean Name = list.contains("Nandan");
		System.out.println(Name);

		boolean Name1 = list.remove("Babu");
		System.out.println(Name1);

		System.out.println(list.get(2));
		System.out.println(list);

		list.clear();

		boolean Name2 = list.isEmpty();
		System.out.println(Name2);
		
//		list.get(0);
//		System.out.println(list.toString());
//		list.clear();
//		System.out.println(list);
//		int a1=list.lastIndexOf(list);
//		System.out.println(a1);

	}

}
