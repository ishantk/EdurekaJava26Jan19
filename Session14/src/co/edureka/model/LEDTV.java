package co.edureka.model;

public class LEDTV extends TV{
	
	String technology;
	
	public LEDTV() {
		System.out.println(">> LEDTV Object Constructed");
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "LEDTV [technology=" + technology + ", brand=" + brand + ", screenSize=" + screenSize + "]";
	}

}
