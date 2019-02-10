package co.edureka.mypack;

public class App {
	
	// main method performs execution
	public static void main(String[] args) {
		
		One oRef = new One();
		Two tRef = new Two();
		
		//oRef.pvtShow(); -> error : accessible only within class
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		//tRef.pvtShow(); -> error : accessible only within class
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}
