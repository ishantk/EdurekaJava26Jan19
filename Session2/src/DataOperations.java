// Data Operations is Logical Part and we put it under the category -> CONTROLLER
public class DataOperations {

	public static void main(String[] args) {
		
		// Container Created and Contains Single Value
		// MODEL
		int a = 6;
		int b = 10;
		
		// Arithmetic Operators
		//int c = a % b; // CONTROLLER
		int c = 5;
		
		//System.out.println("Sum of "+a+" and "+b+" is: "+c); // VIEW
		System.out.println("Remainder is: "+c);
		
		// Unary
		//c++;	// c = c+1; // 2
		//++c;	// c = c+1; // 3
		
		System.out.println("c now is: "+c); // ?
		
		// Relational/Conditional
		// Result as true or false
		System.out.println("Is a Greater then b? " + (a == b) );
		
		//char ch = '\u0905';
		//System.out.println("ch is: "+ch);
		
		// Logical Operators -> To Test more then 1 condition
		System.out.println("Is a Greatest ? " + ( (a > b) || (a > c) ) );
		
		// Problem:
		int num = 123;
		int n1 = num/100;
		int n2 = num%100;
		int n3 = n2/10;
		int n4 = n2%10;
		System.out.println("n1 is: "+n1);
		System.out.println("n2 is: "+n2);
		System.out.println("n3 is: "+n3);
		System.out.println("n4 is: "+n4);
		
		// 100*1 + 10*2 + 1*3 -> How we write a number in Decimal format i.e. using 10
		// HW: Convert 123 into 1's and 0's
		
		// TYPE CASTING
		byte johnsAge = 100;
		
		// We are Putting 8 bit container Data into 32 bit container
		int jenniesAge = johnsAge;
		
		// Error -> We are Putting 32 bit container Data into 8 bit container 
		// We need Down-Casting
		// put (byte) -> down-casting is done and error finishes
		byte siasAge = (byte)jenniesAge; 
				
		
	}

}
