package co.edureka.threads;

// Message over some Network !!
class Message{
	
	String msg = ">> No Message Available";
	
	void writeMessage(String m){
		msg = m; // Writing the input to msg
		System.out.println(">> Message Written !!");
	}
	
	void readMessage(){
		System.out.println(">> Message is: "+msg);
	}
}

class ReaderThread extends Thread{
	
	Message mRef;
	
	ReaderThread(Message m){
		mRef = m;
	}
	
	public void run(){
		synchronized (mRef) {
			
			try {
				mRef.wait(); // wait will make ReaderThread to be blocked. Below written operations will be not executed !!
				//mRef.wait(1000); // wait for a time
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			mRef.readMessage();
		}
	}
	
}

class WriterThread extends Thread{
	Message mRef;
	
	WriterThread(Message m){
		mRef = m;
	}
	
	// When rum is finished, thread is terminated
	public void run(){
		synchronized (mRef) {
			mRef.writeMessage("Search the Candle Rather than Cursing the Darkness !!");
			//mRef.notify();  // Notify Thread who is waiting on mRef !!
			mRef.notifyAll(); // Notify All Threads who are waiting on mRef !!
		}
	}
}

public class WaitNotify {

	public static void main(String[] args) {
	
		Message mRef = new Message(); // Message Object Construction : Single Object of Message

		// Multiple Threads work on same object and we shall synchronize them
		ReaderThread rt1 = new ReaderThread(mRef);
		ReaderThread rt2 = new ReaderThread(mRef);
		WriterThread wt  = new WriterThread(mRef);
		
		//wt.setDaemon(true); // Daemon gets killed when process is killed !!
		
		// NEW State : Thread Object is constructed
		System.out.println("rt1 state is "+rt1.getState());
		System.out.println("rt2 state is "+rt2.getState());
		System.out.println("wt state is "+wt.getState());
		
		rt1.start(); // read operation
		rt2.start(); // read operation
		wt.start();  // write operation
		
		// WAITIING State : Thread is Waiting
		System.out.println("rt1 state is "+rt1.getState());
		System.out.println("rt2 state is "+rt2.getState());
		
		// RUNNABLE State : Thread is in Execution
		System.out.println("wt state is "+wt.getState());
		
	}

}
