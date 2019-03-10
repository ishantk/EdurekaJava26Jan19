package co.edureka.aop;

public class Ride {
	
	// Attributes for Ride
	String source;
	String destination;
	int typeOfCab;
	
	public Ride() {
		System.out.println(">> Ride Object Constructed");
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTypeOfCab() {
		return typeOfCab;
	}

	public void setTypeOfCab(int typeOfCab) {
		this.typeOfCab = typeOfCab;
	}
	
	// Business Method
	// M1 : Check nearest Driver Availability								-> BeforeAdvice
	// M2 : Allocate Driver and book the ride								-> Core Logic
	// M3 : Acknowledging User that cab is booked and share driver details	-> AfterAdvice
	public void bookRide(int distance, boolean cancelRide){
		System.out.println(">> Ride Booking in Process...");
		
		if(typeOfCab!=0){
			System.out.println(">> Thank you for choosing us!!");
			System.out.println(">> Your ride has been booked from "+source+" to "+destination);
			System.out.println(">> Driver John shall be coming to pick you up !!");
		}
		
		System.out.println(">> Ride Booking Finished...");
	}

	@Override
	public String toString() {
		return "Ride [source=" + source + ", destination=" + destination + ", typeOfCab=" + typeOfCab + "]";
	}
	
	

}
