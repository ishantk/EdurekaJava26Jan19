package co.edureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.edureka.model.User;

// Our Code to access database from Java goes in this class !!
// DBHelper is also known as DAO(Data Access Object) Design Pattern
// DBHelper Object will obe used to perform DB operations

/*
 	JDBC Procedure:
 	1. Download Driver from https://dev.mysql.com/downloads/connector/j/8.0.html
 	2. Link the Driver in your Java Project (Confgure Build Path)
 	
 	3* Load the Driver
 	   Class.forname API
 	
 	4* Create Connection
 	   Connection and DriverManager API
 	   username : root and password: 
 	   
 	5* Write SQL Statement
 	   String sql = "insert into User values(null, 'John', 'john@example.com','+91 99999 55555', 28)";
 	   
 	6* Execute SQL Statement
 	   Statement and PreparedStatement API's
 	   
 	7* Close the Connection   
 */

//DBHelper can be any name of your choice
public class DBHelper {
	
	Connection con;			 	// import form java.sql package
	PreparedStatement pStmt; 	// import form java.sql package

	
	// Load the Driver
	public DBHelper() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(">> Driver Loaded");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	// Create Connection
	public void createConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println(">> Connection Created");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	// Write SQL Statement and Execute SQL Statement
	public int insertUserInDB(User uRef){ // User Object Ref is passed as Input
		int i = 0;
		try {
			
			// Write SQL Statement
			String sql = "insert into User values(null, ?, ?, ?)";
			
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.name);
			pStmt.setString(2, uRef.email);
			pStmt.setString(3, uRef.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return i;
	}
	
	
	public boolean loginUser(User uRef){ // User Object Ref is passed as Input
		boolean loginCheck = true;
		try {
			
			// Write SQL Statement
			String sql = "select * from User where email = ? and password = ?";
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.email);
			pStmt.setString(2, uRef.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			loginCheck = rs.next();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return loginCheck;
	}	
	
	
	
	// Close Connection
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">> Connection Closed");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
