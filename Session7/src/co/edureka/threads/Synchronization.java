package co.edureka.threads;

class Printer{
	
	//void printDocument(String docName, int numOfCopies){
	// printDocument is now synchronized : If a thread is accessing printDocument method, a lock will be acquired and shall be released when method finsihes
	// Lock Acquisition happens automatically and release also happens automatically !! : Intrinsic Lock
	//synchronized void printDocument(String docName, int numOfCopies){
	
	 void printDocument(String docName, int numOfCopies){
		for(int i=1;i<=numOfCopies;i++){
			
			try {
				// pause operation for a second. After 1 second resume execution !!
				Thread.sleep(1000); // makes thread sleep temporarily for 1000 milliseconds -> 1 Sec.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			System.out.println(">> "+docName+" Printing: "+i);
		}
	}
	 
	void checkInk(){
		System.out.println(">> Ink Tank is Filled up to 90%. OK !!");
	}
}

class MyPrintingThread extends Thread{
	
	Printer pRef; // Reference to the Printer Object
	
	MyPrintingThread(Printer p){
		pRef = p; // Reference Copy
	}
	
	public void run(){
		// synchronized block : is a lock for the object till block finished its execution
		synchronized (pRef) {
			pRef.checkInk();
			pRef.printDocument("**LearningJava.pdf**", 10);
		}
		
	}
}

class YourPrintingThread extends Thread{
	
	Printer pRef; // Reference to the Printer Object
	
	YourPrintingThread(Printer p){
		pRef = p; // Reference Copy
	}
	
	public void run(){
		// synchronized block
		synchronized (pRef) {
			pRef.printDocument("#MLWithPython.pdf#", 10);
		}
	}
}


public class Synchronization {

	// main method representing main thread
	public static void main(String[] args) {
		
		// Printer Object Construction
		// pRef holds hashCode for Object of Printer !!
		Printer pRef = new Printer(); // 1 single object of Printer
		
		// Printing Document may be a long running operation in case we need n number of copies !!
		// This below job may be a long running operation and hence we should keep it as a separate thread !!
		//pRef.printDocument("LearningJava.pdf", 10);
		
		// printDocument which may take a longer time is now suppose to be executing in a separate thread parallely to the main thread
		// Computer 1
		MyPrintingThread myThread = new MyPrintingThread(pRef);

		// Computer 2
		YourPrintingThread yourThread = new YourPrintingThread(pRef);
		
		myThread.start(); // execute run method internally as Thread has states and state management comes into action
		yourThread.start();
		
		// When we start MyPrintingThread and YourPrintingThread, they are using the same Printer Object !!
		// 2 different threads are working on same object !!
		// As per default operation, both threads will run parallely to the main thread and will share the same object !!
		// threads shall run Asynchronously !!
		// But in Asynchronous Execution (Threads are running parallely) we have a challenge if multiple threads access the same Object !!
		// Use Case: BookMyShow/PayTM to book a movie ticket. One Single Seat can be booked by multiple Users !! -> Challenge
		// 			 Resolution: BookMyShow/PayTM they lock seat (ticket) as a solution
		// Technically in our code we need to Synchronize Threads. If multiple threads work on same object we will lock the object for usage !!
		// Locking object for usage means when one thread is accessing the object other threads shall wait !!
		
		
		// > If multiple thread are suppose to run Synchronously, why we are not just using the main thread
		// > Child Threads were created so as to release burden on main thread.
		// > and when multiple threads are using same object only then we need synchronization (multiple threads run parallel to main but synchronous towards object)
	}

}
