package co.edureka;

/*class Connection{
	
	public Connection() {
		System.out.println(">> Connection Object Constructed");
	}
	
}*/

// Limited User to access the same object every time. 1 Object per Class !!
class Connection{
	
	// We shall create Connection object which is in the class itself
	private static Connection con = new Connection();
	
	// Making Constructor private no one can create object out of this class
	private Connection() {
		System.out.println(">> Connection Object Constructed");
	}
	
	public static Connection getConnection(){
		return con;
	}
}

public class SingleTon {

	public static void main(String[] args) {
		
		//Connection c1 = new Connection();
		//Connection c2 = new Connection();
		
		// Print HashCodes for Objects
		//System.out.println("c1 is: "+c1);
		//System.out.println("c2 is: "+c2)
		
		Connection c1 = Connection.getConnection();
		Connection c2 = Connection.getConnection();
		
		// Print HashCodes for Objects
		System.out.println("c1 is: "+c1);
		System.out.println("c2 is: "+c2);
	}

}
