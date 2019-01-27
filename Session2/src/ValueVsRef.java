
public class ValueVsRef {

	public static void main(String[] args) {
		
		int x = 10;
		int y = x; // Value Copy Operation
		
		y = 111;   // Update Operation
		
		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
		
		int arr1[] = {10, 20, 30, 40, 50};
		int[] arr2 = arr1; // Reference Copy Operation
		
		System.out.println("arr1 is: "+arr1);
		System.out.println("arr2 is: "+arr2);

		// Update Operation
		arr2[1] = 111;
		arr2[3] = 333;
		
		for(int elm : arr1){
			System.out.print(elm+"  ");
		}
		
		// arr1 and arr2 are different reference variables which points to the same Array in the HEAP !!  
		
		System.out.println();
		
		for(int elm : arr2){
			System.out.print(elm+"  ");
		}
		
	}

}
