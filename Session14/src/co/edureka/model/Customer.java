package co.edureka.model;

import java.util.List;

public class Customer {
	
	String name;
	String email;
	
	// 1 to 1
	Address address; 		// HAS-A Relationship -> Dependency
	
	// 1 to many
	List<String> cards;  	// HAS-A Relationship -> Dependency
	
	/*
	public Customer() {
		// High Coupling
		// address = new Address(); // Do not do this !!
		// We will have a dependency of Address Object Construction on Customer Object Construction
	}
	
	// Constructor
	public Customer(Address address) {
		// Low Coupling
		this.address = address;
	}
	
	// Setter Method
	public void setAddress(Address address){
		this.address = address;
	}*/
	
	public Customer() {
		System.out.println(">> Customer Object Constructed");
	}

	public Customer(Address address) {
		this.address = address;
		System.out.println(">> Customer Object Constructed with Address Object as Input");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println(">> Customer Object Constructed using Setter Method with Address Object as Input");
		this.address = address;
	}

	public List<String> getCards() {
		return cards;
	}

	public void setCards(List<String> cards) {
		System.out.println(">> Cards Setter");
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", address=" + address + "]";
	}

}
