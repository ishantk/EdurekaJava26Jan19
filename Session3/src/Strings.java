
public class Strings {

	public static void main(String[] args) {
		
		// Interned Way
		String str1 = "Hello World"; // Hello World is a literal created in constant pool
		String str2 = "Hello World";
		
		// Object Way
		String str3 = new String("HELLO World");
		String str4 = new String("Hello World");
		
		// String is a Multi Value Container -> It is storing lot of characters
		// Multi Value Containers are Reference Types !!
		
		// str1, str2, str3 and str4 are reference variables !! They must contain HashCodes
		// Lets see what is printed when we print reference variables
		// We see the content rather than HashCodes
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		// toString() is a method in String class which is executed automatically even if you don't put it !!
		// toString() method is executed and it gives content rather than hashCodes
		System.out.println("str1.toString() is: "+str1.toString());
		System.out.println("str2.toString() is: "+str2.toString());
		System.out.println("str3.toString() is: "+str3.toString());
		System.out.println("str4.toString() is: "+str4.toString());
		
		// // str1, str2, str3 and str4 are reference variables !! Lets Test This !!
		
		// We are comparing Reference Variables
		// Content is not Compared !!!
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		if(str1 == str3){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
			
		// Content Comparison
		// equals -> true or false
		//if(str1.equals(str2)){
		//if(str1.equalsIgnoreCase(str2)){
		if(str1.compareTo(str2) == 0){
			System.out.println("str1 equals str2");
		}else{
			System.out.println("str1 not equals str2");
		}
		
		//if(str3.equals(str4)){
		if(str3.compareToIgnoreCase(str4) == 0){	
			System.out.println("str3 equals str4");
		}else{
			System.out.println("str3 not equals str4");
		}
		
		//if(str1.equals(str3)){
		if(str1.compareTo(str3) == 0){
			System.out.println("str1 equals str3");
		}else{
			System.out.println("str1 not equals str3");
		}

	}

}
