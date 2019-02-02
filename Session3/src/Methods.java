import java.util.Scanner; // Scanner is a Pre-Defined Class to read data from Console

public class Methods {
	
	// When our logic is suppose to be executed again and again just develop a Method !!

	// Defining a Function : Non Static
	void wholeSquare(int x, int y){
		int z = (x*x) + (y*y) + 2*(x*y);
		System.out.println(x+" and "+y+" whole sq is: "+z);
	}
	// x, y and z are temporary containers, they are destroyed once method execution finishes !!

	// Defining a Function : Static
	// What is static -> We shall cover it in our upcoming Sessions
	static void wholeSquareAgain(int x, int y){
		int z = (x*x) + (y*y) + 2*(x*y);
		System.out.println(x+" and "+y+" whole sq is: "+z);
	}
	
	// Here we have Ack specified as double
	// We must return and return should happen at the end.
	double areaOfCircle(double radius){
		double area = 3.14 * radius * radius;
		return area; // Ack as specified in method's signature
	}
	
	void areaOfCircle1(double radius){
		double area = 3.14 * radius * radius;
		System.out.println("Area of circle with radius "+radius+" is "+area);
	}
	
	// PS: A method can be either static or non static
	//     Access Modifiers in upcoming Sessions. Packages in Java !!

	// main -> represents the jobs to be executed by main thread !!
	// whatever we write in main is executed by main thread in a sequence !!
	public static void main(String[] args) {
		
		/*int a = 10;
		int b = 20;
		int c = (a*a) + (b*b) + 2*(a*b);
		System.out.println(a+" and "+b+" whole sq is: "+c);
		
		// If we wish to compute whole square once again we need to write the same statements again
		a = 11;
		b = 13;
		c = (a*a) + (b*b) + 2*(a*b);
		System.out.println(a+" and "+b+" whole sq is: "+c);
		
		// Problem -> If we wish to recompute we need to re write the same code again !!
		a = 21;
		b = 33;
		c = (a*a) + (b*b) + 2*(a*b);
		System.out.println(a+" and "+b+" whole sq is: "+c);*/
		
		// Object Construction for Scanner, a Built In Class !!
		Scanner scanner = new Scanner(System.in); // System.in is to read (in is a ref variable for InputStream)
		
		//int a = 10; // job1
		//int b = 20; // job2
		
		System.out.println("Enter Value for a: "); // System.out is to write (out is a ref variable to OutputStream)
		int a = scanner.nextInt();
		System.out.println("Enter Value for b: ");
		int b = scanner.nextInt();
		
		scanner.close(); // Release Scanner i.e. clear memory resources !!
		
		// Execution of Methods
		// For a Non Static Method we need to write an Object Construction Statement !!
		Methods mRef = new Methods(); // -> To Create an Object
		// Likewise Arrays, Ref Var is in Stack and new creates Object in Heap at run time
		// PS: We shall discuss object in our upcoming Sessions !!
		mRef.wholeSquare(a, b); // Executing a Method-> we have a separate method frame for storing data during its execution
		mRef.wholeSquare(11, 13);
		mRef.wholeSquare(21, 33);
		
		System.out.println();
		
		// Execution of static methods
		// For a static method we need not to create an Object. Simply access it with class name !!
		Methods.wholeSquareAgain(15, 15);
		mRef.wholeSquareAgain(13, 13); // We can even use Ref of Object to access a static method.
		
		System.out.println();
		double result = mRef.areaOfCircle(3.3);
		System.out.println("Area of Circle with radius 3.3 is: "+result);
		System.out.println("Area of Circle with radius 6.6 is: "+mRef.areaOfCircle(6.6)); // job n

	}

}
