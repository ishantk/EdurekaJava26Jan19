
public class NestedLoops {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++){
			//System.out.println("i is: "+i);
			// Loop in a Loop
			for(int j=1;j<=i;j++){
				System.out.print(j+"  ");
			}
			
			System.out.println();
		}

	}
}
