package co.edureka.model;

/*
 	RDBMS : MySQL as Database | XAMPP (GUI to access DB)
 	
 	1. Create a Database
 		// Go to XAMPP GUI and simply in Database Tab, create a database with a name
 		// Write create database command to create database
 		
 	2. Create Table(s) as per your requirements. In case you need to relate them, relate them than.
 		ORM : Object Relational Mapping (Map Object with Table)
 		create table User(
 			uid int primary key auto_increment,
 			name varchar(256),
 			email varchar(256),
 			phone varchar(20),
 			age int
 		)
 		
 		// Creating a Table is basically replication of Object Structure
 		// Conver attributes to column names of table
 	
 	3. Insert Operation
 		insert into User values(null, 'John', 'john@example.com','+91 99999 55555', 28)
 		insert into User values(null, 'Jennie', 'jennie@example.com','+91 77777 55555', 29)
 		
 	4. Update Operation
 		update User set name = 'John Watson', email = 'john.w@example.com', phone='+91 99999 99999', age = 30 where uid = 1
 		
 	5. Delete Operation
 		delete from User where uid = 1 
 	
 	6. Select Operation
 		select * from User
 		select * from User where uid = 1
 		select * from User where age > 28
 		select name, phone from User
 	
 */


// Model/Bean/POJO
public class User {

	// Attributes
	public int uid;
	public String name;
	public String email;
	public String phone;
	public int age;
	
	public User() {
	
	}

	public User(int uid, String name, String email, String phone, int age) {
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", age=" + age + "]";
	}
	
}
