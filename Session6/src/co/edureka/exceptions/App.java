package co.edureka.exceptions;

public class App {

	public static void main(String[] args) {
		
		final boolean DEBUG = true; // We use this flag in real time software solutions
		// DEBUG is true -> we are in development mode | otherwise we are in release mode
		
		System.out.println(">> App Started");

		int[] arr = {0, 20, 30, 40, 50};
		int a=10, b=0, c=0;
		
		try{
			c = a/b; // When error at run time is generated here at line#16, control moves directly to catch block 
			System.out.println("arr[10] is: "+arr[10]);
			//System.out.println(">> This must be executed !!"); // This will not be executed
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			if(DEBUG){
				aRef.printStackTrace();
			}else{
				System.out.println("Some Index Error Occurred !!");
			}
		}catch(ArithmeticException aRef){
			if(DEBUG){
				aRef.printStackTrace();
			}else{
				System.out.println("Some Arithmetic Error Occurred !!");
			}
		}*/
		catch(Exception e){ // Run Time Polymorphism : Ref. Var. of Parent can point to any Exception Child Object
			if(DEBUG){
				e.printStackTrace();
			}else{
				System.out.println("Some Error Occurred !!");
			}
		}finally{ // which will be executed at any cost. 
			System.out.println(">> This must be executed !!");
		}
		System.out.println("c is: "+c);
		
		System.out.println(">> App Finished");
		
	}

	// When our main starts and finishes gracefully -> Normal Termination of Program
	// When our main starts and crashes -> Abnormal Termination of Program
	// JVM found an error. JVM created an Object of class ArrayIndexOutOfBoundsException, wrote a message in it and threw it !!
	// Throwing of an Object by JVM crashes the program !!
	
	// ERROR at RUNTIME is called EXCEPTION which crashes program !!
	// A crash in a program is no good !! OS Performance will be affected !!
	// As a resolution we keep try and catch !! try block has statements which can throw errors at run time and catch catches the same !!
}
