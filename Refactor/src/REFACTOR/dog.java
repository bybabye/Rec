package REFACTOR;

public class dog extends Animals {
	
	void bark() {
		System.out.println("The dog barking...");
	}
}

class Cat extends Animals{

	void meow() {
		System.out.println("The cat meowing...");
	}
}

class Animals {
	String name;
	int height;
	int weight;
}
