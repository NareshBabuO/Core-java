package com.xworkz.keyboard.fruit.inheritancesrunners;

import com.xworkz.fruit.inheritances.sub.Mango;
import com.xworkz.fruit.inheritances.sup.Fruit;

public class MangoRunner {

	public static void main(String[] args) {
		
		Mango mango=new Mango();
		mango.name="Manjo";
		mango.type="Sweet";
		mango.weight=2;
		mango.from="Karnatka";
		mango.costperKg=135;
		mango.award="Nation Fruit";
		mango.printData();
		
		Fruit fruit=new Mango();
		
		Mango convertedfromparent = (Mango) fruit;
		{
			convertedfromparent.name="Mango-1";
			convertedfromparent.type="Kickle";
			convertedfromparent.weight=1;
			convertedfromparent.from="Andra";
			convertedfromparent.costperKg=180;
			convertedfromparent.award="None";
			convertedfromparent.printData();
			
		}
		
		
		
	} 

}
