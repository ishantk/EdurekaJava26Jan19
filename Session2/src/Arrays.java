
public class Arrays {

	public static void main(String[] args) {
		
		// Single Value Container
		int a1 = 10;
		System.out.println("a1 is: "+a1);
		
		// Multi Value Container
		// Homogeneous Container -> Data should be same type !! -> Array
		//int[] a2 = { 10, 20, 30, 40, 50 };		// Implicit Syntax -> we can miss new int[]
		//int[] a2 = new int[]{ 10, 20, 30, 40, 50 }; // Explicit Syntax
		//int a2[] = { 10, 20, 30, 40, 50 };
		int a2[] = new int[]{ 10, 20, 30, 40, 50 };
		// new is an operator which will create array at run time in heap area
		System.out.println("a2 is: "+a2);
		
		// a2 is not an array. a2 is a REFERENCE VARIABLE which holds HashCode of Array !!

		// a1 is Primitve 	-> Compile Time		| Static		| Stack
		// a2 is Reference  -> Run Time 		| Dynamic		| Heap
		
		// Below Statement we are giving size and not data
		// a3 points to an array which will have 10 elements with all elements as 0
		int[] a3 = new int[10];
		System.out.println("a3 is: "+a3);
		
		//int[] a4;
		//a4 = new int[5];
		
		// Write or Update Data in Array
		a2[1] = 111;
		
		a3[0] = 123;
		a3[4] = 456;
		a3[9] = 987;
		
		// Size of Array is FIXED. We cannot Change IT !!
		
		// Read the data from Array
		System.out.println("a2[0] is: "+a2[0]);
		System.out.println("a2[1] is: "+a2[1]);
		
		System.out.println();
		
		System.out.println("a3[0] is: "+a3[0]);
		System.out.println("a3[1] is: "+a3[1]);
		
		System.out.println();
		
		// Use length property of Array
		System.out.println("a2 length is: "+a2.length);
		System.out.println("a3 length is: "+a3.length);
		
		System.out.println();
		
		// Read All Operation
		for(int i=0; i<a2.length; i++){
			System.out.print(a2[i]+"  ");
		}
		
		System.out.println();
		
		for(int i=0; i<a3.length; i++){
			System.out.print(a3[i]+"  ");
		}
		
		System.out.println();
		
		// Replacing Traditional For Loop with Enhanced For Loop
		// Enhanced For Loop works with Arrays !! As of Now !!
		for(int anyName : a3){
			System.out.print(anyName+"  ");
		}
	}

}
