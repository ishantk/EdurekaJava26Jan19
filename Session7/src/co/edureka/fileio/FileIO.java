package co.edureka.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/*
 Stream : is flow of data
		 as bytes
		 as text

API's from java.io package to deal with files !!

Byte Streams: 		Data Flows as bytes
FileOutputStream	-> Write
FileInputStream		-> Read
text, audio, video or image or any other file !!


Character Streams:	Data Flows as Characters
FileWriter			-> Write
FileReader			-> Read
text files !!

*/

class Employee{
	
	// Attributes
	int eid;
	String name;
	String designation;
	
	void showEmployeeDetails(){
		System.out.println(">> "+eid+"\t"+name+"\t"+designation);
	}
}

public class FileIO {
	
	void saveEmployee(Employee eRef){
		try {
	
			File file = new File("/Users/ishantkumar/Downloads/emps16feb2019_1.csv");
			/*
			//FileOutputStream out = new FileOutputStream(file); 	// contents of file will be overwritten
			FileOutputStream out = new FileOutputStream(file, true); // contents of file will be appended (true-> append mode enabled)
			String data = eRef.eid+","+eRef.name+","+eRef.designation+"\n";
			out.write(data.getBytes()); // Perform a write operation in the form of bytes
			out.close(); 				// Close the Resources
			System.out.println(">> Contents Written for "+eRef.name);
			*/
			
			//FileWriter writer = new FileWriter(file); 	// contents of file will be overwritten
			FileWriter writer = new FileWriter(file,true);  // contents of file will be appended (true-> append mode enabled)
			String data = eRef.eid+","+eRef.name+","+eRef.designation+"\n";
			writer.write(data); // Perform a write operation in the form of text
			writer.close();
			System.out.println(">> Contents Written for "+eRef.name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void readEmployees(){
		try {
			//File file = new File("/Users/ishantkumar/Downloads/emps16feb2019_1.csv");
			File file = new File("/Users/ishantkumar/Downloads/WrapperClasses.java");
			
			/*
			FileInputStream in = new FileInputStream(file); // Reads data as bytes
			
			int i = 0;
			// read() method return a byte as int
			while( (i = in.read()) != -1){ // we keep on reading byte by byte till we dont get -1, which is end of file !!
				char ch = (char)i;   // downcast int to char
				System.out.print(ch);
			}
			in.close(); // release memory resources
			*/
			
			FileReader reader = new FileReader(file);				// Reads data as text
			BufferedReader buffer = new BufferedReader(reader);		// BufferedReader reads from FileReader line by line
			
			String line = "";
			int countObjects = 0;
			while( (line = buffer.readLine()) !=null ){
				System.out.println(line);
				if(line.contains("new")){
					countObjects++;
				}
			}
			System.out.println(countObjects+" Objects created in "+file.getName()+" Source File !!");
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		/*
		Employee emp1 = new Employee();
		emp1.eid = 101;
		emp1.name = "John Watson";
		emp1.designation = "Senior Android Developer";
		
		Employee emp2 = new Employee();
		emp2.eid = 201;
		emp2.name = "Fionna Flynn";
		emp2.designation = "Data Scientist";
		
		emp1.showEmployeeDetails();
		emp2.showEmployeeDetails();
		
		// Objects are created in RAM which is further temporary
		// Data in Objects will be lost when program finishes, so we must save the data
		// To save data we call it as Persistance -> 1. Files  |  2. DataBase
		
		FileIO fRef = new FileIO();
		fRef.saveEmployee(emp1);
		fRef.saveEmployee(emp2);
		*/
		
		FileIO fRef = new FileIO();
		fRef.readEmployees();
		
	}

}
