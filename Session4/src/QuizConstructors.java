// Structure for Counter Object
// Textual Representation how a Counter Object will look like
// Whatever we are writing in class is property of Object !!
class Counter{

	// Attribute : Property of Object
	int count;
	
	// Attribute : Property of Class
	static int sCount;
	
	// Compiler creates a special method called Constructor !!
	/*Counter(){
		count = 0;
	}*/
	
	// We can create a constructor to have initial value of attributes in Object
	// Executed when Object is created in memory !!
	// Default Constructor -> Constructor with no Inputs
	Counter(){
		count = 1;
		sCount = 1;
	}
	
	// Overloading Constructors
	// Parameterized or Non Default Constructor -> Constructor with Inputs/Parameters
	Counter(int c){ // int c -> value not reference
		count = c;
		sCount = c;
	}
	
	// Method : Property of Object
	void incrementCount(){
		count++;
		sCount++;
	}
	
	// Method : Property of Object
	void showCount(){
		System.out.println("count is: "+count+" and sCount is: "+sCount);
	}
}


public class QuizConstructors {

	public static void main(String[] args) {
		
		// We created 2 objects pointed by c1 and c2 !!
		// c1 and c2 are reference variables pointing to 2 different objects !!
		Counter c1 = new Counter(); // Counter(); -> Execution of Constructor  -> count = 1 | sCount 1
		Counter c2 = new Counter(3);// Counter(3); -> Execution of Constructor -> count = 3 | sCount 3
		Counter c3 = c1; // Reference Copy | c1 and c3 points to the same object
		
		System.out.println("c1 is: "+c1);
		System.out.println("c2 is: "+c2);
		System.out.println("c3 is: "+c3);
		
		c1.incrementCount(); // 1 -> 2	| 4
		c2.incrementCount(); // 3 -> 4  | 5 
		c3.incrementCount(); // 2 -> 3  | 6
		
		c1.showCount(); // count is: 3 and sCount is ?
		c2.showCount(); // count is: 4 and sCount is ?
		c3.showCount(); // count is: 3 and sCount is ?
	}

}
