
public class MultiDimArray {

	public static void main(String[] args) {
		
		// Array of Arrays
		// 1-D Array
		int[] a1 = {10, 20, 30, 40, 50};
		
		//2-D Array
		int[][] a2 = {
						{10, 20, 30},		// 0
						{10, 20},			// 1
					//	 0    1
						{10, 20, 30, 40},	// 2
						{10},				// 3
						{10, 20, 30, 50},	// 4
					 };
		
		System.out.println("a1 is: "+a1+" and a1 length is: "+a1.length);
		
		System.out.println("a2 is: "+a2+" and a2 length is: "+a2.length);
		
		System.out.println("a2[1] is: "+a2[1]+" and a2[1] length is: "+a2[1].length); 
		
		System.out.println("a2[4][3]: "+a2[4][3]); // 50
		//System.out.println("a2[3][3]: "+a2[3][3]); // Does not exist -> Error ar Run Time
		
		// Explore Reading All Elements in 2-D Array
		// Using Traditional Loops as well Enhanced For Loop !!
		
		

	}

}
