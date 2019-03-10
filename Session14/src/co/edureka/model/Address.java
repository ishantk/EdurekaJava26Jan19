package co.edureka.model;

public class Address {
	
	String adrsLine;
	int zipCode;
	
	public Address() {
		System.out.println(">> Address Object Constructed");
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [adrsLine=" + adrsLine + ", zipCode=" + zipCode + "]";
	}
	
}
