interface I1{
	
}

interface I2{
	
}

class A{
	
}

// Only 1 extends allowed but multiple implementation allowed
class B extends A implements I1,I2{
	
}


public class InterfacesAgain {

	public static void main(String[] args) {

		// Polymorphic Statements:
		// Ref Var of Parent pointing to Object of Child !!
		A aRef = new B();
		
		// Ref Var of Interface is pointing to the object which implements it !!
		I1 iRef1 = new B();
		I2 iRef2 = new B();
		
		B bRef = new B(); // Direct Statement
		
	}

}
