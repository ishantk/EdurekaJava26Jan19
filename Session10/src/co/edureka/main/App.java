package co.edureka.main;

import java.util.ArrayList;

import co.edureka.db.DBHelper;
import co.edureka.model.User;

public class App {

	public static void main(String[] args) {
		
		User uRef1 = new User(0,"Anaya","anaya@example.com","+91 99999 77777", 20);
		User uRef2 = new User(0,"Kia Flynn","kia.f@example.com","+91 99999 998888", 32);
		
		System.out.println(uRef1);
		System.out.println(uRef2);
		
		// Object created above contains data which is available temporarily in the RAM
		// Once program finishes data is lost !! Hence, we need persistance i.e. save data of an Object
		// 1. Plain Files -> java.io APIs
		// 2. XML Files	  -> DOM and SAX APIs
		// 3. Database 	  -> java.sql package and DB as MySQL
		
		// 1. Driver Loaded
		DBHelper dbHelper = new DBHelper();
		
		// 2. Connection Created
		dbHelper.createConnection();
		
		// 3. Write and Execute SQL Statement
		/*int i = dbHelper.insertUserInDB(uRef2);
		if(i>0){
			System.out.println(">> User Inserted: "+i);
		}else{
			System.out.println(">> User Not Inserted: "+i);
		}*/
		
		/*
		int i = dbHelper.updateUserInDB(uRef2);
		if(i>0){
			System.out.println(">> User Updated: "+i);
		}else{
			System.out.println(">> User Not Updated: "+i);
		}
		*/
		
		/*
		int i = dbHelper.deleteUserFromDB(3);
		if(i>0){
			System.out.println(">> User Deleted: "+i);
		}else{
			System.out.println(">> User Not Deleted: "+i);
		}
		*/
		
		/*
		ArrayList<User> users = dbHelper.fetchUsersFromDB();
		for(User user : users){
			System.out.println(user);
		}
		*/
		
		//dbHelper.executeProcedure(uRef2);
		
		dbHelper.processBatch();
		
		//4. Close the Connection
		dbHelper.closeConnection();

	}

}
