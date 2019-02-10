package co.edureka.mypack; // This is the package where One.java and One.class resides in src and bin respectively !!

// public: accessible everywhere (within/outside mypack)
public class One {

	private void pvtShow(){
		System.out.println(">> This is private show of One");
	}
	
	void defShow(){
		System.out.println(">> This is default show of One");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of One");
	}
	
}

// error : We cannot have a second public class in the same One.java source  file
// In java when class is public it is mandatory to save source file name with class name
//public class Two{
	
//}

// default : no modifier | accessible within package (only within mypack)
// we can have n number of default classes in the same source file i.e. One.java
class Two{
	
	private void pvtShow(){
		System.out.println(">> This is private show of Two");
	}
	
	void defShow(){
		System.out.println(">> This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of Two");
	}
	
}

// private : accessible only within class | and we cannot use it while creating a class
// private cannot be used to create class directly in source file
//private class Three{
	
//}

//protected : accessible only within package and outside the package it is inheritable
//protected cannot be used to create class directly in source file
//protected class Four{
	
//}
