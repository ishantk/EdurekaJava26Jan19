
public class BreakContinue {

	public static void main(String[] args) {
		
		int myFloor = 5;
		
		for(int floor=1; floor<=10; floor++){
			System.out.println("Elevator is on Floor #"+floor);
			if(myFloor == floor){
				System.out.println(">> I have Reached my Floor #"+floor);
				break; // break shall terminate the loop
			}
		}

		// We have lot of data and we are performing a search. When my linear search is over i need o break !!
		
		
		System.out.println();
		for(int i=1;i<=10;i++){
			
			if(i<=5){
				continue; // skip statements written below nd move to next iteration
			}
			
			System.out.println("i is: "+i);
		}
	}

}
