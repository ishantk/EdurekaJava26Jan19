// When we hit run button, class with main method is executed
public class Primitives {

	// Write your code in main
	// whatever we write in main, shall be executed !!
	// we write jobs in main method which are executed by main thread sequentially !!
	// main method represents main thread of process !!
	public static void main(String[] args) {
		
		// Creating a Single Value Container with writing data in it !!
		int x = 10;	// J1 -> Creation Statement
		
		// Update Operation
		x = 111;  // Contents of Container modified	// J2
		
		// Read Operation
		System.out.println("x is: "+x);	// J3
		
		// Delete Operation
		// Container is deleted automatically we need not to worry about it !!
		
		float pi = 3.14f;
		double d = 3.14;
		
		// Characters : can store keyboard character(ASCII CODES) as well UNICODES
		char ch = 'A';
		ch = 'Z';
		System.out.println("ch is: "+ch);
		
		ch = '\u20b9';	// 20b9 is UniCode for character ₹
		System.out.println("ch now is: "+ch);
		
		ch = 65;	// 65 is ASCII Code for character A
		System.out.println("ch now is: "+ch);
		
		boolean isGpsConnected = true; // represents 1
		isGpsConnected = false;		   // represents 0
		
		// Single Value Containers are restricted to store only 1 single value !! -> Primitive Types
		//ch = 'A','B';  //err
		//pi = 3.14, 4.25; // err
	}

}
