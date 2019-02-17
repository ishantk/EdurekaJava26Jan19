package co.edureka;

class Outer{
	void show(){
		System.out.println("==This is show of Outer==");
	}
	
	// Nested Class : Container in a Container
	class Inner{
		void show(){
			System.out.println("**This is show of Inner in Outer**");
		}
	}
}

public class NestedDemo {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		oRef.show();
		
		Outer.Inner iRef = oRef.new Inner();
		iRef.show();
	}

}
