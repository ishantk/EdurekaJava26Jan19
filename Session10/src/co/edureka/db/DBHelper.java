package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	Statement stmt; 			// import form java.sql package
	PreparedStatement pStmt; 	// import form java.sql package
	
	CallableStatement cStmt;	// import form java.sql package
	
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
			//String sql = "insert into User values(null, '"+uRef.name+"', '"+uRef.email+"','"+uRef.email+"', "+uRef.age+")";
			String sql = "insert into User values(null, ?, ?, ?, ?)";
			
			// Execute SQL Statement
			//stmt = con.createStatement(); 
			//i = stmt.executeUpdate(sql); // this will return a non zero integer for successful insert operation
			
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.name);
			pStmt.setString(2, uRef.email);
			pStmt.setString(3, uRef.phone);
			pStmt.setInt(4, uRef.age);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return i;
	}
	
	public int updateUserInDB(User uRef){ // User Object Ref is passed as Input
		int i = 0;
		try {
			
			// Write SQL Statement
			String sql = "update User set name = ?, email = ?, phone = ?, age = ? where uid = ?";
			
			// Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.name);
			pStmt.setString(2, uRef.email);
			pStmt.setString(3, uRef.phone);
			pStmt.setInt(4, uRef.age);
			pStmt.setInt(5, uRef.uid);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return i;
	}
	
	public int deleteUserFromDB(int uid){ 
		int i = 0;
		try {
			
			// Write SQL Statement
			String sql = "delete from User where uid = ?";
			
			// Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, uid);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return i;
	}
	
	public ArrayList<User> fetchUsersFromDB(){
		ArrayList<User> users = new ArrayList<User>();
		try {			
			// Write SQL Statement
			String sql = "select * from User";
			
			// Execute SQL Statement
			pStmt = con.prepareStatement(sql);
			
			// ResultSet will hold all the fetched records
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				
				User user = new User();
				
				user.uid = rs.getInt(1);
				user.name = rs.getString(2);
				user.email = rs.getString(3);
				user.phone = rs.getString(4);
				user.age = rs.getInt(5);
				
				//System.out.println(user);
				users.add(user);
			}
						
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return users;
	}
	
	public void executeProcedure(User uRef){
		try {
			
			// SQL Command to execute Stored Procedure
			String sql = "{ call addUser(?, ?, ?, ?) }"; // execution of stored procedure addUser(?, ?, ?, ?)
			
			// Execute SQL Statement
			cStmt = con.prepareCall(sql);
			cStmt.setString(1, uRef.name);
			cStmt.setString(2, uRef.email);
			cStmt.setString(3, uRef.phone);
			cStmt.setInt(4, uRef.age);		
			
			cStmt.execute();
			System.out.println(">> Procedure Executed");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	
	public void processBatch(){
		
		try {
			
			 String sql1 = "insert into User values(null, 'George', 'george@example.com','+91 99999 55555', 40)";
			 String sql2 = "delete from User where userid = 7"; // SQL Statement is incorrect as userid is not available as column name
			 
			 // We are going to manage batch as a transaction
			 con.setAutoCommit(false);
			 
			 stmt = con.createStatement();
			 stmt.addBatch(sql1);
			 stmt.addBatch(sql2);
			 
			 stmt.executeBatch(); // Execution in On Go !!
			 System.out.println(">> Batch Executed");
			 
			 con.commit(); // Execute Batch as a Transaction (Both SQL Statement should execute)
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			
			try {
				con.rollback(); // If any error occurs while executing the batch, we shall rollback the transaction
				System.out.println(">> Transaction Rolled Back");
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
		}
		
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
