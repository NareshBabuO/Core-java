package com.xworkz.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StateRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Karntaka");
		list.add("Andra Pradesh");
		list.add("Gujarat");
		list.add("Bihar");
		list.add("Rajasthan");
		list.add("Uttar Pradesh");
		list.add("Assam");
		list.add("Kerala");
		list.add("Madya Pradesh");
		list.add("Manipur");
		list.add("Tripura");
		list.add("Himachal Pradesh");
		list.add("Sikkim");
		list.add("Jharkhand");
		list.add("Arunachal Pradesh");
		list.add("Meghalaya");
		list.add("Uttarakhand");
		list.add("Tamil Nadu");
		list.add("Goa");
		list.add("Chhattisgarh");
		list.add("West Bengal");
		list.add("Mizoram");
		list.add("Haryana");

		list.stream().forEach((states) -> {
			System.out.println(states);
		});
		System.out.println("==========================");
		list.stream().filter(state -> state.endsWith("a")).forEach((elements) -> {
			System.out.println("element ends with a :" + elements);
		});
		System.out.println("******************************");
		list.stream().filter(state -> state.startsWith("K")).forEach((element) -> {
			System.out.println("element start with K :" + element);
		});
		System.out.println("******************************");
		list.stream().filter(state -> state.contains("c")).forEach((element) -> {
			System.out.println("element with c:" + element);
		});
		System.out.println("******************************");
		list.stream().filter(state -> state.contains("d")).forEach((element) -> {
			System.out.println("element with d:" + element);
		});
		System.out.println("**************************");
		list.stream().filter(state -> state.contains("r")).forEach((element) -> {
			System.out.println("elements with r :" + element);
		});
		System.out.println("**************************");
		list.stream().filter(state -> state.contains("h")).forEach((element) -> {
			System.out.println("elements with h :" + element);
		});
		System.out.println("**************************");
		list.stream().filter(state -> state.length() > 10).forEach((element) -> {
			System.out.println("element >10 :" + element);
		});
		System.out.println("**************************");
		list.stream().filter(state -> state.length() < 5).forEach((element) -> {
			System.out.println("element <5 :" + element);
		});
		System.out.println("**************************");
		list.stream()
				// .filter(state->state.toUpperCase(state))
				.map(state -> state.toUpperCase()).forEach((element) -> {
					System.out.println(element);
				});
		System.out.println("**************************");
		//toUppercase
		list.stream().map(state -> state.toLowerCase()).forEach((element) -> {
			System.out.println(element);
		});
		System.out.println("**************************");
		//to reverse
		list.stream().map(state -> new StringBuffer(state).reverse()).forEach((element) -> {
			System.out.println(element);
		});
		System.out.println("**************************");

	}

}
