package co.edureka.model;

public class Address {
	
	// Attributes
	Integer aid;
	String adrsLine;
	String city;
	String state;
	Integer zipCode;
	
	// HAS-A Relationship | 1 to 1
	//Customer customer; // 1 to 1 Relationship Mapping
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	

	public Address(Integer aid, String adrsLine, String city, String state, Integer zipCode) {
		this.aid = aid;
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	/*
	public Address(Integer aid, String adrsLine, String city, String state, Integer zipCode, Customer customer) {
		this.aid = aid;
		this.adrsLine = adrsLine;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.customer = customer;
	}
	*/

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + "]";
	}

	/*
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", adrsLine=" + adrsLine + ", city=" + city + ", state=" + state + ", zipCode="
				+ zipCode + ", customer=" + customer + "]";
	}
	*/
	
}
