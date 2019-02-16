package co.edureka.lang;

public class WrapperClasses {

	public static void main(String[] args) {
		
		// Primitive Type or Single Value Container !!
		int i = 10;
		
		// Lets convert Primitive Type to an Object
		// Process of Conversion is also called as BOXING

		// Explicit Statements
		Integer iRef = new Integer(i);  	// BOXING 

		// iRef is a reference variable which points to Integer Object !!
		// Integer Object holds data as in i !!
		
		int j = iRef.intValue(); 			// UNBOXING
		
		char ch = 'A';
		Character chRef = new Character(ch); // BOXING
		char dh = chRef.charValue();	     // UNBOXING
		
		double d = 2.2;
		Double dRef = new Double(d);
		double e = dRef.doubleValue();
		
		// Implicit Statements
		Integer kRef = i; 	// AUTO-BOXING 		| Translated as Integer kRef = new Integer(i);
		int k = kRef;		// AUTO-UNBOXING	| Translated as int k = kRef.intValue();
		
		int l = kRef.intValue();	// UNBOXING gives value as int
		String s = kRef.toString(); // UNBOXING gives value as String
		
		//String str = "10";
		String str = String.valueOf(10);
		
		System.out.println("i is: "+i);
		System.out.println("s is: "+s);
		
	}

}
