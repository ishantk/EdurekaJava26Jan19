class Parent{
	
	// purchaseBike is non static and belongs to Object
	void purchaseBike(){
		System.out.println(">> Lets buy Bajaj Pulsar !!");
	}

	// purchaseCar is static and belongs to Class
	static void purchaseCar(){
		System.out.println(">> Lets buy Maruti Swift !!");
	}
}

/*
 	1. Object to Object | non static
 	2. Class to Class   | static
 	
 */

// We have nothing in Child Class !!
class Child extends Parent{
	
	// purchaseBike is non static and belongs to Object
	// purchaseBike of Parent Object is Re-Defined in the Child Object with same signature (method name, return type and inputs)
	// Overriding
	void purchaseBike(){
		System.out.println(">> Lets buy Royal Enfiled !!");
	}

	// purchaseCar is static and belongs to Class
	// purchaseCar of Parent Class is Re-Defined in the Child Class with same signature (method name, return type and inputs)
	// Hiding
	static void purchaseCar(){
		System.out.println(">> Lets buy Honda City !!");
	}
}

public class Overriding {

	public static void main(String[] args) {

		Child cRef = new Child();
		
		// If we re-define parent's methods in Children it will execute child's version rather than Parent !! -> OVERRIDING
		
		cRef.purchaseBike(); // From the Parent Object | Object to Object Inheritance
		
		Child.purchaseCar(); // From the Parent Class  | Class to Class Inheritance
	}

}
