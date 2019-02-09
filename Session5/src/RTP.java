// Textual Representation of an Object
/*class Cab{
	// Property of Object
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	// Property of Object	
	void bookCab(String source, String destinition){
		System.out.println(">> Cab Booked from "+source+" to "+destinition+" !!");
	}
}*/

// >> Optimize RTP
// abstract class cannot be instantiated -> We cannot create its objects !! (BUT, Run Time Environment can create it !!)
// As per rule of Inheritance, Parent Object is Constructed before Child Object. (RTE)
/*abstract class Cab{
	// Property of Object
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	// Property of Object
	// abstract method can be created in an abstract class only
	// it will have no definition
	// abstract method acts like a rule created by parent which child must define !!
	// if we have n number of abstract methods, child must define all n methods !!
	// This is a RULE or a PROTOCOL by Parent for Child!!
	abstract void bookCab(String source, String destinition);
	
	// We can have regular/concrete methods: We need not to override them !! Its not a Rule !!
	void fun(){
		System.out.println("This is fun");
	}
}*/

// As of now we optimized RTP in a way now, we cannot directly create an object of Cab
// bookCab method of Cab was making no sense we just made it a rule to be created by children


// Lets give the best shot to have Run Time Polymorphism Fixed Up !!
// Optimize it to the Best !!
// instead of abstract class Cab -> we got an interface
interface Cab{ 
	// Constructor is not allowed in interfaces !!
	// interfaces cannot have constructors -> Neither we nor RTE can create its objects !!
	// PS: With interface we cannot do Object to Object inheritance !!
	/*
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}*/
	
	// This is a RULE or a PROTOCOL not by Parent for Child!!
	// This is a RULE or a PROTOCOL which can be implemented by any Object !!
	void bookCab(String source, String destinition); // -> public abstract void bookCab(String source, String destinition);
	// if we have n methods in interfaces we must define all of them in classes which implements it
	
	// We cannot have regular/concrete methods in interface
	/*
	void fun(){
		System.out.println("This is fun");
	}*/
}


class MiniCab implements Cab{//extends Cab{ //extends Cab{-> It means inheritance
	// Property of Object
	MiniCab(){
		System.out.println(">> MiniCab Object Constructed");
	}
	
	// Property of Object | Implementing a Rule (If we dont define it we get an error here)
	public void bookCab(String source, String destinition){
		System.out.println(">> MiniCab Booked from "+source+" to "+destinition+" !!");
	}	
}

class LuxuryCab implements Cab{//extends Cab{
	// Property of Object
	LuxuryCab(){
		System.out.println(">> LuxuryCab Object Constructed");
	}
	// Property of Object | Implementing a Rule
	public void bookCab(String source, String destinition){
		System.out.println(">> LuxuryCab Booked from "+source+" to "+destinition+" !!");
	}
}

class Bike implements Cab{//extends Cab{
	// Property of Object
	Bike(){
		System.out.println(">> Bike Object Constructed");
	}
	// Property of Object | Implementing a Rule
	public void bookCab(String source, String destinition){
		System.out.println(">> Bike Booked from "+source+" to "+destinition+" !!");
	}
}

public class RTP {
	public static void main(String[] args) {
		
		//MiniCab mRef = new MiniCab();
		//mRef.bookCab("Pristine Magnum", "Country Homes");
		
		// Ref Var of Parent points to Object of Child : Polymorphic Statement
		//Cab cRef = new MiniCab(); // MiniCab IS-A Cab
		
		// Run Time Polymorphism !!
		// 1. cRef can point to multiple objects | Polymophic in nature !!
		// 2. bookCab method is same but books different cabs as per reference to the object !!
		
		// Ref Variable of Interface can point to Object which implements it !!
		
		Cab cRef = new MiniCab(); //new MiniCab(); -> Object Construction of MiniCab
		cRef.bookCab("Pristine Magnum", "Country Homes"); // Overriding Comes into action
		
		System.out.println();
		
		cRef = new LuxuryCab();
		cRef.bookCab("Pristine Magnum", "Country Homes");
		
		System.out.println();
		
		cRef = new Bike();
		cRef.bookCab("Pristine Magnum", "Country Homes");
		
		/*
		System.out.println();
		cRef = new Cab(); // We can create Cab object directly also !!
		cRef.bookCab("Pristine Magnum", "Country Homes");
		*/
	}
}
