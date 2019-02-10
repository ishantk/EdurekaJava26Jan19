package co.edureka.threads;

/*class MyTask{
	void executeTask(){
		for(int i=1;i<=10;i++){
			System.out.println("** MyTask "+i);
		}
	}
}*/

// Child Thread !!
class MyTask extends Thread{ // MyTask IS-A Thread
	// run is method of Thread class which we need to override
	// What child thread has to do should go in the run method
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("** MyTask "+i);
		}
	}
}

class CA{
	
}

//class YourTask extends CA,Thread{ error -> Multiple Inheritance is not supported
class YourTask extends CA implements Runnable{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println("## YourTask "+i);
		}
	}
}

public class App {

	// main method which will execute instructions written in it !!
	// main method represents main thread !!
	public static void main(String[] args) {
		
		// Job1
		System.out.println(">> App Started");

		// Job2
		// Challenge:
		// If Job2 takes a longer duration to execute, Job3 will be blocked till time Job2 will not finish !!
		// >>>> main thread's Jobs they will be blocked <<<<
		// if main thread's jobs they are blocked for a longer duration, OS will give a message to the User -> Would you like to wait or kill the App??
		// -> Application is not Responding. Would you like to wait or kill the App ??
		// Solution:
		// We create a separate thread from main and put the long running jobs in them.
		// Below statements for MyTask may take a longer time and we must put them in a separate thread which will run parallely to the main thread
		MyTask mRef = new MyTask(); 
		//mRef.executeTask();
		
		Runnable r = new YourTask(); // Polymorphic Statement
		Thread tRef = new Thread(r);
		
		mRef.start(); // start will execute the child thread and execute run method of MyTask
		tRef.start();
		
		// Job3
		for(int i=1;i<=10;i++){
			System.out.println(">> main thread "+i);
		}
		
		// Job4
		System.out.println(">> App Finished");
		
	}

}
