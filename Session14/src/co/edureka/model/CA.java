package co.edureka.model;

import java.util.Date;

public class CA {
	
	public CA() {
		System.out.println(">> CA Object Constructed");
	}
	
	public void sayHello(String name){
		Date date = new Date();
		System.out.println("Hello, "+name+" !!");
		System.out.println("ItS: "+date);
	}

}
