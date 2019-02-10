package co.edureka.exceptions;

// IOException is related to File IO in Java
import java.io.IOException; // IOException has to be imported as its in a different package

// User Defined Exception:
// UNCHECKED EXCPETION : MyBankingException is Child of RuntimeException
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message); // execution of Parent's Constructor with message
	}
}

//CHECKED EXCPETION : YourBankingException is Child of Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

public class Banking {

	int accountBalance = 10000;
	int minimumBalance = 2000;
	int attempts = 0;
	
	void withdraw(int amount){
		
		accountBalance = accountBalance - amount;
		
		if(accountBalance < minimumBalance){
			accountBalance = accountBalance + amount;
			System.out.println("Withdrawl Failed !! Balance is: LOW \u20b9"+accountBalance);
			attempts++;
		}else{
			System.out.println("Withdrawl Success !! New Balance is: \u20b9"+accountBalance);
		}
		
		if(attempts == 3){
			// We as a developer can create an Object and throw it !!
			// ArithmeticException -> UNCHECKED EXCEPTION -> throwing an Unchecked Exception
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts: "+attempts);
			//throw aRef; // Throwing an Object -> Crashing the Program !!
			// Here we are throwing Unchecked Exception compiler will not give us errors to surround your code with try catch !!
			
			MyBankingException bRef = new MyBankingException("Illegal Attempts: "+attempts);
			throw bRef;
		}
		
	}
	
	// When your method throws IOException which is a Checked Exception
	// Compiler shall give us an error and we will put throws in Method's Signature
	void withdrawAgain(int amount) throws IOException, YourBankingException{ // When we will execute withdrawAgain method it will thorw an IOException
		
		accountBalance = accountBalance - amount;
		
		if(accountBalance < minimumBalance){
			accountBalance = accountBalance + amount;
			System.out.println("Withdrawl Failed !! Balance is: LOW \u20b9"+accountBalance);
			attempts++;
		}else{
			System.out.println("Withdrawl Success !! New Balance is: \u20b9"+accountBalance);
		}
		
		if(attempts == 3){
			// We as a developer can create an Object and throw it !!
			// IOException -> CHECKED EXCEPTION -> throwing an Checked Exception
			//IOException iRef = new IOException("Illegal Attempts: "+attempts);
			//throw iRef; // Throwing an Object -> Crashing the Program !!
			// Here we are throwing Checked Exception compiler will give us errors to surround your code with try catch !!
			
			YourBankingException yRef = new YourBankingException("Illegal Attempts: "+attempts);
			throw yRef;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(">> Banking Started");

		Banking bRef = new Banking();
		
		// For n number of wring attempts made by user, bank's resources will be occupied
		/*try{ // we need to be aware of putting try catch ourselves in case it is an Unchecked Exception
			for(int i=1;i<=100;i++){
				bRef.withdraw(3000);
			}
		}catch(Exception e){
			System.out.println(">> Some Error Occurred");
		}*/
		
		try{ 
			for(int i=1;i<=100;i++){
				bRef.withdrawAgain(3000); // Ensuring that method execution is surrounded with try catch block is now responsibility of Compiler
			}
		}catch(Exception e){
			System.out.println(">> Some Error Occurred"+e);
		}
		
		System.out.println(">> Banking Finished");
	}

}
