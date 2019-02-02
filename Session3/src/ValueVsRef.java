

public class ValueVsRef {
	
	// Non Static -> We need Object to execute them
	void passByValue(int x){
		x = x * 5;
		System.out.println("x is: "+x);
	}
	
	void passByRef(int[] p){
		System.out.println("p is: "+p);
		p[0] = 111;
		p[4] = 444;
		System.out.println("p[0] is: "+p[0]);
		System.out.println("p[4] is: "+p[4]);
	}

	public static void main(String[] args) {
		
		// a and b are different memory locations !!
		// and they hold their own data !!
		int a = 10;
		int b = a;  							// Value Copy 
		
		b = 11;
		
		System.out.println("a is: "+a);
		System.out.println("b is: "+b);

		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = arr1;						// Reference Copy
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr2 is: "+arr2);
		
		// Updating Data in Array
		arr2[2] = 222;
		arr2[3] = 333;
		
		System.out.println("arr1[2] is: "+arr1[2]);
		System.out.println("arr1[3] is: "+arr1[3]);

		/*
		for(int elm : arr1){
			System.out.println(elm+"  ");
		}
		*/
		
		// Object Construction Statement
		ValueVsRef vRef = new ValueVsRef();
		vRef.passByValue(a); // Value Passing
		System.out.println("a after method execution is: "+a);
		// a and x are different containers with different data !!
		
		vRef.passByRef(arr1); // Reference Passing
		
		System.out.println();
		
		System.out.println("arr1[0] is: "+arr1[0]);
		System.out.println("arr1[4] is: "+arr1[4]);
		
		System.out.println();
		
		System.out.println("arr2[0] is: "+arr2[0]);
		System.out.println("arr2[4] is: "+arr2[4]);
		
	}

}
