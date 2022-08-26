package com.xworkz.accessmodifier.sup;

public class Fish {

	protected String breed;
	protected String type;

	protected Fish() {
		System.out.println("default Constructor");
	}

	protected Fish(String breed, String type) {
		this.breed = breed;
		this.type = type;
		System.out.println("With breed , type argumenets");
	}

	protected String getBreed() {
		return this.breed;
	}

	protected String getType() {
		return this.type;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not Null");
			if (obj instanceof Fish) {
				System.out.println("Object is Type of Fish");
				Fish converted = (Fish) obj;
				String b1 = converted.breed;
				String b2 = converted.type;
				if (this.breed.equals(b1) && this.type.equals(b2)) {
					System.out.println("Both are same");
					return true;
				}

			} else {
				System.err.println("Object is not Type of Fish");
			}
		} else {
			System.err.println("Object is Null");
		}
		return super.equals(obj);
	}
}
