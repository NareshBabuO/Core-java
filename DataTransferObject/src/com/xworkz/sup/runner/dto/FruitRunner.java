package com.xworkz.sup.runner.dto;

import com.xworkz.sup.dto.FruitDTO;

public class FruitRunner {

	public static void main(String[] args) {
	//	(casted.name.equals(this.name) && (casted.teast.equals(this.teast) && (casted.fruit1name
//				.equals(this.fruit1cost)
//				&& (casted.totalBread.equals(this.totalBread) && (casted.fruit1Teast.equals(this.fruit1cost)
//						&& (casted.fruit2name.equals(this.fruit2name)
//								&& (casted.fruit2Teast.equals(this.fruit2name)
//										&& (casted.highestGrowingState.equals(this.highestGrowingState)
//												&& (casted.fruit4name.equals(this.fruit4name)

		FruitDTO fruit = new FruitDTO();
		System.out.println(fruit.hashCode());
		fruit.setName("mango");
		fruit.setTeast("Sweat");
		fruit.setFruit1name("Apple");
		fruit.setTotalBread("5");
		fruit.setFruit1Teast("chill");
		fruit.setFruit2name("Orange");
		fruit.setFruit2Teast("Sweat");
		fruit.setFruit3name("Sapota");
		fruit.setFruit3Teast("high Sweet");
		fruit.setHighestGrowingState("AP");
		fruit.setFruit4name("PineApple");
		fruit.setFruit4Teast("Spicy");
		

		FruitDTO fruit1 = new FruitDTO();
		System.out.println(fruit1.hashCode());
		fruit1.setName("mango");
		fruit1.setTeast("Sweat");
		fruit1.setFruit1name("Apple");
		fruit1.setTotalBread("5");
		fruit1.setFruit1Teast("chill");
		fruit1.setFruit2name("Orange");
		fruit1.setFruit2Teast("Sweat");
		fruit1.setFruit3name("Sapota");
		fruit1.setFruit3Teast("high Sweet");
		fruit1.setHighestGrowingState("AP");
		fruit1.setFruit4name("PineApple");
		fruit1.setFruit4Teast("Spicy");
		
		fruit.equals(fruit1);
	}

}
