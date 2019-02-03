// Textual Representation how a User Object will look like in memory
// Whatever we write in class belongs to Object
class User {
	// Attributes : Property of Object and Not of class
	// We can have either private or non private members to Object
	String name;
	private String phone;
	String email;
	char gender;
	private int age;
	String address;
	
	// Within this boundary private attributes are visible -> class User { //..... }
	// Methods can access them !!
	
	// Methods : Property of Object 
	// Indirect ways to access data of Object
	
	
	// Method : Perform Write Operation in Object
	void setDataForUser(String n, String p, String e, char g, int a, String ad){
		name = n;
		phone = p;
		email = e;
		gender = g;
		age = a;
		address = ad;
	}
	
	// Method: Read Operation
	void showDataForUser(){
		System.out.println("*******");
		System.out.println(name+" is "+age+" years old and lives in "+address);
		System.out.println(name+" can be contacted at "+phone+" or "+email);
		System.out.println("*******");
	}
}


public class Obejcts {

	public static void main(String[] args) {
		
		// Object Construction Statement
		// new creates User Object which is a container with data in memory i.e. heap area at run time i.e. dynamically!
		User uRef1 = new User();
		User uRef2 = new User();
		User uRef3 = uRef1; // Reference Copy !!
		
		// uRef1 and uRef2 are not Objects. They can be any name.
		// uRef1 and uRef2 are Reference Variables pointing to two different Objects !!
		
		System.out.println("uRef1 is: "+uRef1);
		System.out.println("uRef2 is: "+uRef2);
		System.out.println("uRef3 is: "+uRef3);
		
		// Write Operation : Write Data in Object
		/*uRef1.name = "John";
		uRef1.phone = "+91 99999 88888";
		uRef3.email = "john@example.com";
		uRef1.gender = 'M';
		uRef3.age = 30;
		uRef1.address = "Redwood Shores";

		uRef2.name = "Sia";
		uRef2.phone = "+91 77777 88888";
		uRef2.email = "sia@example.com";
		uRef2.gender = 'F';
		uRef2.age = 28;
		uRef2.address = "Pristine Magnum";
		
		// Update Operation
		uRef3.address = "Eastern Shores";
		
		// Read Operation : Reading Data from Object
		System.out.println(uRef1.name+" is "+uRef1.age+" years old and lives in "+uRef1.address);
		System.out.println(uRef2.name+" is "+uRef2.age+" years old and lives in "+uRef2.address);
		System.out.println(uRef3.name+" is "+uRef3.age+" years old and lives in "+uRef3.address);
		
		// Delete Operation : Taken Care by Garbage Collector of JVM
		// uRef1 = null;
		// System.gc(); // Executing Garbage Collector in case we need to release the memory instantly !! 
		 */
		
		// Writing Data in Object using a method !!
		uRef1.setDataForUser("John", "+91 99999 88888", "john@example.com", 'M', 30, "Redwood Shores");
		uRef2.setDataForUser("Sia", "+91 77777 88888", "sia@example.com", 'F', 28, "Pristine Magnum");
		
		// Reading Data from Object using a method !!
		uRef1.showDataForUser();
		uRef2.showDataForUser();
		uRef3.showDataForUser();
		
		// Private Attribute of an Object is only visible within Object and not Outside
		// We do not wish that our attributes whould be accessed directly !! -> Data Hiding !!
		/*uRef1.name = "John Watson";			// OK
		uRef1.phone = "+91 98765 98765";	// ERR
		uRef1.age = 20;						// ERR
		*/
		
	}

}
