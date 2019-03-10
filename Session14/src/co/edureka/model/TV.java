package co.edureka.model;

public class TV {
		
	String brand;
	int screenSize;

	public TV() {
		System.out.println(">> TV Object Constructed");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "TV [brand=" + brand + ", screenSize=" + screenSize + "]";
	}
	
}
