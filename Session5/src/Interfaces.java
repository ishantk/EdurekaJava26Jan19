// Rule Book : 2 Rules to be Implemented
interface Inf1{
	// Attributes is Property of Interface
	int x = 10;	 // -> Translated as public static final int x = 10;
	
	void show(); // -> Translated as public abstract void show();
	void hello();
	//int addNumbers(int num1, int num2); // We can methods with Ack and inputs as well !!
}

interface Inf2{
	void show(); // -> Translated as public abstract void show();
	void bye();
}

// 1. Class to Class
// 2. Object to Object
// 3. Interface to Interface | Multiple Inheritance is Supported
interface Inf3 extends Inf1, Inf2{
	
}

// We can have Multiple Implementation which is not Multiple Inheritance
// this is implements not extends !!
// Multiple Implementation is Supported and Multiple Inheritance is not Supported !!
class CA implements Inf3{//Inf1, Inf2{ // Define Rules from Inf1 and Inf2 in CA
	
	public void show(){
		System.out.println(">> This is show");
	}
	
	public void hello(){
		System.out.println(">> This is hello");
	}
	
	public void bye(){
		System.out.println(">> This is bye");
	}
	
	void fun(){
		System.out.println(">> This is fun of CA");
	}
}


public class Interfaces {

	public static void main(String[] args) {
		
		//Inf1.x = 100; // error -> we cannot modify value of x. It has become final or constant !!
		//System.out.println("Inf1.x is: "+Inf1.x);

		/*
		
		Inf1 iRef1 = new CA(); // Polymorhic Statement 
		iRef1.show();
		iRef1.hello();
		//iRef1.bye(); // errors
		//iRef1.fun(); // errors
		
		System.out.println();
		
		Inf2 iRef2 = new CA(); // Polymorhic Statement 
		iRef2.show();
		//iRef2.hello(); // errors
		iRef2.bye(); 
		//iRef2.fun();  // errors
		
		*/
		
		Inf3 iRef3 = new CA(); // Polymorhic Statement 
		iRef3.show();
		iRef3.hello();
		iRef3.bye(); 
		//iRef3.fun(); // errors
		
		System.out.println();
		
		CA cRef = new CA();
		cRef.show();
		cRef.hello();
		cRef.bye();
		cRef.fun();
		
	}

}
