package co.edureka.yourpack;

/*
 	private  : only within class
	default  : only within package
	protected: only within package
	public   : anywhere !!
 */

//import co.edureka.mypack.*; // imports all the public classes together
import co.edureka.mypack.One; // accessible as One is public in mypack
//import co.edureka.mypack.Two; // error -> Two is default in mypack

// Inheritance Across Package !!
// CA is Child in yourpack whereas One is Parent in mypack
// Only public and protected is inherited
// private and default is not inherited

// protected after inheritance behaves like private
class CA extends One{
	
	void fun(){
		//pvtShow(); // err : Not Inherited
		//defShow(); // err : Not Inherited
		protShow(); // protShow() was behaving like private so we accessed it in the class itself !!
	}
	
}


public class App {
	
	// main method to perform execution
	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow(); -> error : accessible only within class
		//oRef.defShow(); -> error : accessible only within package
		//oRef.protShow();-> error : accessible only within package
		oRef.pubShow(); // Accessible Everywhere
		
		System.out.println("--CA--");
		
		CA cRef = new CA();
		cRef.pubShow();
		//cRef.protShow(); // error -> After Inheritance behaves like private
		cRef.fun();

	}

}
