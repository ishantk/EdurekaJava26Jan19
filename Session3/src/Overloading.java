
public class Overloading {
	
	void add(int num1, int num2){
		int sum = num1 + num2;
		System.out.println("Addition of 2 numbers is: "+sum);
	}
	
	// we cannot create a method with same name again
	// Lets try to rename inputs -> Its still an error. Renaming inputs will not have any impact
	// Lets try to add return type -> Its still an error. 
	/*int add(int n1, int n2){
		int sum = n1 + n2;
		//System.out.println("Addition is: "+sum);
		return sum;
	}*/
	// Conclusion: Function with same name and same inputs cannot be redefined
	
	// We can use the same name but lets try to change inputs:
	// This is acceptable
	void add(int num1, int num2, int num3){
		int sum = num1 + num2 + num3;
		System.out.println("Addition of 3 numbers is: "+sum);
	}
	
	void add(double num1, double num2, double num3){
		double sum = num1 + num2 + num3;
		System.out.println("Addition of 3 double numbers is: "+sum);
	}
	
	void add(int num1, double num2){
		double sum = num1 + num2;
		System.out.println("Addition of 2 numbers is: "+sum);
	}
	
	void add(double num1, int num2){
		double sum = num1 + num2;
		System.out.println("Addition of 2 numbers is: "+sum);
	}
	
	// Overloading -> Re-Defining the same name again with different inputs
	/*
	 	Rules:
	 		1. Function name should be same
	 		2. Inputs must be different i.e. unique
	 			2.1 Number of Inputs
	 			2.2 Type of Inputs
	 			2.3 Sequence of Inputs
	 		3. Return type has no role to play
	 */
	public static void main(String[] args) {
		
		Overloading oRef = new Overloading();
		
		// Same method add is doing different operations upon getting different inputs
		// POLYMORPHISM -> More than 1 form of add method
		// Overloading -> Method Overloading !!
		oRef.add(10, 20);
		oRef.add(11, 45);
		oRef.add(11, 45, 97);
		oRef.add(11.11, 45.45, 97.97);
		oRef.add(12.22, 10);
		oRef.add(12, 10.55);

	}

}
