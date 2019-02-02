
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		String str = new String("Hello");
		str.concat(" World");
		System.out.println("str is: "+str);
		
		System.out.println();
		
		// If we are manipulating a String we will always get a new String !!
		// Old String is not modified.
		
		//String name = "Mr.".concat("John"); //String name = "Mr." + "John";  
		//System.out.println("name is: "+name);

		// MUTABLE Strings
		StringBuffer buffer = new StringBuffer("Hello");    // Thread-Safe
		buffer.append(" World");
		System.out.println("buffer is: "+buffer);
		
		System.out.println();
		
		StringBuilder builder = new StringBuilder("Hello"); // Not Thread-Safe
		builder.append(" World");
		System.out.println("builder is: "+builder);
		
		// PS: Thread-Safety we will see later
		
		// If we wish to perform String manipulation operations -> Prefer either buffer or builder
		// We cannot use StringBuffer and StringBuilder in Interned Way
		//StringBuffer buf = "Hello World";  // error
		//StringBuilder bld = "Hello World"; // error
		
	}

}
