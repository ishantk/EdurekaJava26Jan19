package co.edureka.xml;

// Textual Representation of an Object
public class Employee {

	// Attributes of an Object
	public int eid;
	public String name;
	public int salary;
	public String designation;
	
	public Employee() {
	
	}

	public Employee(int eid, String name, int salary, String designation) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
	
}
