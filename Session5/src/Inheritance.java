// e-Commerce Web Site
// We have many products which are displayed and can be sold !!
// Each and every product listed is an Object !!

// Textual Representation of Mobile Object

/*class Mobile{
	
	// Attributes - Property of Object
	int pid;
	String name;
	String brand;
	int price;
	String os;
	int memory;
	int ram;
	
	// Default Constructor - Property of Object
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	// Methods - Property of Object
	void setDataForMobile(int pid, String name, String brand, int price, String os, int memory, int ram){
		
		// this.pid = pid; ->this.pid is property of object | pid is property of method
		// this is a reference variable which shall point to the current object
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.os = os;
		this.memory = memory;
		this.ram = ram;
	}
	
	void showDataForMobile(){
		System.out.println("==="+pid+" | "+name+"===");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("OS:"+os);
		System.out.println("Memory:"+memory);
		System.out.println("RAM:"+ram);
		System.out.println("===================");
	}
	
}

class Shoe{
	
	// Attributes - Property of Object
	int pid;
	String name;
	String brand;
	int price;
	int size;
	String color;
	
	// Default Constructor - Property of Object
	Shoe(){
		System.out.println(">> Shoe Object Constructed");
	}
	
	// Methods - Property of Object
	void setDataForShoe(int pid, String name, String brand, int price, int size, String color){
		
		// this.pid = pid; ->this.pid is property of object | pid is property of method
		// this is a reference variable which shall point to the current object
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.color = color;
	}
	
	void showDataForShoe(){
		System.out.println("==="+pid+" | "+name+"===");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("Size:"+size);
		System.out.println("Color:"+color);
		System.out.println("===================");
	}
	
}
*/

// Textual Representation of Object
// Structure for Product Object : Generalized Version for any product on e-Commerce Platform
// Common Code is in Product and we will now further re-use it anywhere we need it !!
class Product{

	// Attributes - Property of Object
	int pid;
	String name;
	String brand;
	int price;
	
	// Default Constructor - Property of Object
	Product(){
		System.out.println(">> Product Object Constructed");
	}
	
	// Methods - Property of Object
	void setDataForProduct(int pid, String name, String brand, int price){
		// this.pid = pid; ->this.pid is property of object | pid is property of method
		// this is a reference variable which shall point to the current object
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	void showDataForProduct(){
		System.out.println("==="+pid+" | "+name+"===");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+price);
		System.out.println("===================");
	}
}

// Mobile is an extended version of Product
// Mobile will have few more attributes as per requirement
// Parent-Child Relationship created which is: IS-A Relation -> Mobile IS-A Product
class Mobile extends Product{
	
	// Attributes - Property of Object
	String os;
	int memory;
	int ram;
	
	// Default Constructor - Property of Object
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	// Methods - Property of Object
	void setDataForMobile(int pid, String name, String brand, int price, String os, int memory, int ram){
		// executing method of parent to set attributes/data
		setDataForProduct(pid, name, brand, price);
		this.os = os;
		this.memory = memory;
		this.ram = ram;
	}
	
	void showDataForMobile(){
		// executing method of parent to show attributes/data
		showDataForProduct();
		System.out.println("###################");
		System.out.println("OS:"+os);
		System.out.println("Memory:"+memory);
		System.out.println("RAM:"+ram);
		System.out.println("###################");
	}
	
}

class Shoe extends Product{
	
	// Attributes - Property of Object
	int size;
	String color;
	
	// Default Constructor - Property of Object
	Shoe(){
		System.out.println(">> Shoe Object Constructed");
	}
	
	
	// Methods - Property of Object
	void setDataForShoe(int pid, String name, String brand, int price, int size, String color){
		// executing method of parent to set attributes/data
		setDataForProduct(pid, name, brand, price);
		this.size = size;
		this.color = color;
	}
	
	void showDataForShoe(){
		// executing method of parent to show attributes/data
		showDataForProduct();
		System.out.println("###################");
		System.out.println("Size:"+size);
		System.out.println("Color:"+color);
		System.out.println("###################");
	}
	
}


// Observation -> For n number of objects on an e-Commerce platform we have to code a lot !!
// 				  Many attributes will be common or repeatedly coming in !!
//				  Shoe and Mobile classes are extended from Product class. So, Shoe and Mobile are siblings
public class Inheritance {

	public static void main(String[] args) {

		// Lets Create Object for Mobile Phone
		Mobile mRef = new Mobile();
		//mRef.setDataForMobile(101, "iPhoneX", "Apple", 80000, "iOS", 128, 4);
		//mRef.showDataForMobile();
				
		System.out.println();
		
		Shoe sRef = new Shoe();
		//sRef.setDataForShoe(201, "AlphaBounce", "Adidas", 7000, 9, "Black");
		//sRef.showDataForShoe();
		
		// Rule : Parent Object is Constructed before the Child Object !!
		// 		  Ref Variable of Child can access all the properties of Parent !!
		//		  Other than private properties and constructor child can access anything of parent !!
		// 		  >>>>> Constructors and private properties are not Inherited <<<<<< 
		
		
		// Lets use parent's properties and write data in objects
		/*mRef.setDataForProduct(101, "iPhoneX", "Apple", 80000);
		sRef.setDataForProduct(201, "AlphaBounce", "Adidas", 7000);
		
		mRef.showDataForProduct();
		System.out.println();
		sRef.showDataForProduct();*/
		System.out.println();
		mRef.setDataForMobile(101, "iPhoneX", "Apple", 80000, "iOS", 128, 4);
		sRef.setDataForShoe(201, "AlphaBounce", "Adidas", 7000, 9, "Black");
		
		mRef.showDataForMobile();
		System.out.println();
		sRef.showDataForShoe();
	}

}
