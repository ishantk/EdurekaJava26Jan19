// Textual Representation of Object
class Student{
	
	// Attributes: Property of Object (Non-Static)
	int roll;
	String name;
	
	// Attribute : Property of Class (static) and not of Object
	static String schoolName;
	
	// Constructor: Property of Object
	Student(){
		roll = 0;
		name = "NA";
	}
	
	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	
	// Method: Property of Object
	void setDataForStudent(int roll, String name){
		// this is a reference variable which shall hold hashCode for Object in Action
		// Here Left han side variables are attributes of object and right hand side are variables which are inputs to method
		// this.roll -> Object's Property
		// roll -> Method's Property
		this.roll = roll;
		this.name = name;
	}
	
	// Method : Property of Object 
	void showDataForStudent(){
		// Property of Object can access Property of Class !!
		System.out.println(name+" goes to "+schoolName);
		System.out.println(roll+" belongs to "+name);
	}
	
	// Method : Propert of Class
	static void setDataForSchool(String name){
		schoolName = name;
	}
	
	static void showSchoolName(){
		// Property of Class cannot access Property of Object 
		//System.out.println("Name is: "+name); // err
		System.out.println("==="+schoolName+"===");
	}
	
	/*
	static void setDataForSchool(String schoolName){
		Student.schoolName = schoolName;
	}
	*/
	
}

public class StaticDemo {

	public static void main(String[] args) {
		
		// Object Construction Statement
		// s1 is a ref variable which shall hold HashCode for Student Object !!
		Student s1 = new Student();
		Student s2 = new Student();
		
		Student.setDataForSchool("ABC International");
		
		s1.setDataForStudent(101, "George");
		s2.setDataForStudent(201, "Fionna");
		
		s1.showDataForStudent();
		s2.showDataForStudent();
		
		// Class's Property is accessed with class name
		///Student.schoolName = "ABC International";
		
		Student.showSchoolName();
		
		// Allowed: Ref Var of Object can access property of class
		s1.setDataForSchool("XYZ International");
		
		// Allowed: Ref Var of Object can access property of class
		s1.showSchoolName();
		s2.showSchoolName();
		Student.showSchoolName();
		
		// PS: For all the objects, class as a container is common !!
		// We can use Class Container as a Global Container for all objects which will share data and methods

	}

}
