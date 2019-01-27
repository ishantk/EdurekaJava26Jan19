
public class Conditions {

	public static void main(String[] args) {
		
		boolean isInternetConnected = false;
		boolean isGPSConnected = true;
		
		// if/else
		/*if(isInternetConnected){
			System.out.println("You can use Google Maps");	
		}else{
			System.out.println("Please Connect to Internet and Try Again !!");
		}*/
		
		// nested if/else
		if(isInternetConnected){
			System.out.println("You can use Google Maps");
			if(isGPSConnected){
				System.out.println("You can Navigate using Google Maps");
			}else{
				System.out.println("Please Connect to GPS and Try Again !!");
			}
		}else{
			System.out.println("Please Connect to Internet and Try Again !!");
		}

		if(isInternetConnected && isGPSConnected){
			System.out.println("You can Navigate using Google Maps");
		}else{
			System.out.println("Please Connect to Internet/GPS and Try Again !!");
		}
		
		// OLA Ride Booking App Example:
		int olaMicro = 1;
		int olaMini = 2;
		int olaSedan = 3;
		
		int userChoice = 7;
		
		// Ladder if/else
		if(userChoice == olaMicro){
			System.out.println("OLA Micro Cab Booked !!");
			// your code goes here !!
		}else if(userChoice == olaMini){
			System.out.println("OLA Mini Cab Booked !!");
		}else if(userChoice == olaSedan){
			System.out.println("OLA Sedan Cab Booked !!");
		}else{
			System.out.println("Please Enter a Valid Choice");
		}
		
		System.out.println();
		userChoice = olaMini;
		// Nested if/else can be replaced with switch/case
		switch (userChoice) {
			case 1:
				System.out.println("OLA Micro Cab Booked !!");
				break;
	
			case 2:
				System.out.println("OLA Mini Cab Booked !!");
				break;
				
			case 3:
				System.out.println("OLA Sedan Cab Booked !!");
				break;
				
			default:
				System.out.println("Please Enter a Valid Choice");
				break;
		}
		
		int johnsAge = 10;
		int ageToVote = 18;
		
		if(johnsAge >= ageToVote){
			System.out.println("John can Vote");
		}else{
			System.out.println("John cannot Vote");
		}
		
	}

}
