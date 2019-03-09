package co.edureka.model;

import java.util.List;

public class Customer {
	
	// Attributes
	Integer cid;
	String name;
	String email;
	
	// 1 Customer Object will have Reference to 1 Address Object
	//Address address; // HAS-A Relationship | 1 to 1

	// 1 Customer Object will have Reference to many Address Objects in the form of List Collection
	List<Address> addresses; // HAS-A Relationship | 1 to many
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer cid, String name, String email) {
		this.cid = cid;
		this.name = name;
		this.email = email;
	}
	
	/*
	public Customer(Integer cid, String name, String email, Address address) {
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	 */
	
	public Customer(Integer cid, String name, String email, List<Address> addresses) {
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.addresses = addresses;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", addresses=" + addresses + "]";
	}

	/*
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}*/
	
	

}
