package co.edureka.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {
	
	// 1 to 1
	CA ca;	// Has-A Relationship -> Dependency
	
	public CB() {
		System.out.println(">> CB Object Contructed");
	}

	// Dependency Resolution with Constructor
	@Autowired
	public CB(CA ca) {
		System.out.println(">> CB Object Contructed with CA Object as Input in Constructor");
		this.ca = ca;
	}

	public CA getCa() {
		return ca;
	}

	// Dependency Resolution with Setter
	//@Autowired
	public void setCa(CA ca) {
		System.out.println(">> CB Object Contructed with CA Object as Input in Setter");
		this.ca = ca;
	}

}
