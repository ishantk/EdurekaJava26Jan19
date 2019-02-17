package co.edureka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

// Object is the Root Class for any class which we create that class is child of Object
class Employee{// extends Object{ -> Every class in Java is by default child of Object
	
	int eid;
	String name;
	
	Employee(){
		
	}
	
	Employee(int eid, String name){
		this.eid = eid;
		this.name = name;
	}
	
	// toString gets executed automatically when we print Reference Variable of Object
	public String toString(){
		return "["+eid+" | "+name+"]";
		//return "["+eid+" | "+name+"]"+" - "+super.toString(); // super-> refers to Parent Object
	}

}

public class ListDemo {

	public static void main(String[] args) {
		
		// Collection to store multiple Objects
		// Hetrgeneous Collection : Can store any type of data
		ArrayList list1 = new ArrayList();
		
		// Homogeneous Collection : Can store only String and Employee resp.
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Employee> list3 = new ArrayList<Employee>();
		
		Employee eRef1 = new Employee(101, "Fionna");
		Employee eRef2 = new Employee(201, "Sia");
		
		System.out.println("eRef1 is: "+eRef1); // Printing Ref Var will automatically execute toString method
		System.out.println("eRef2 is: "+eRef2);
		
		//1. Add Data in ArrayList
		//list1.add(0,"John");
		list1.add("John");	//0
		list1.add("Jennie");//1
		list1.add(10);		//2 	-> AutoBoxed i.e. list1.add(new Integer(10));
		list1.add(2.2);		//3
		list1.add('A');		//4
		list1.add(eRef1);	//5
		
		list2.add("John");
		list2.add("Jennie");
		list2.add("Jim");
		list2.add("John");		// duplicates allowed
		list2.add("Jack");
		list2.add("Joe");
		//list2.add(eRef1); 	//err
		//list2.add(2.2);		//err
		
		// Industry : Object Storage (Use Case)
		list3.add(eRef1);
		list3.add(eRef2);
		//list3.add('A'); 		//err
		//list3.add(2.2);		//err
		
		//2. Print the data in List : Simply Print Reference Variable of your list (It shall execute toString())
		// Printing Reference Variable of list do not give hashCode rather data ? -> toString is overrided in ArrayList class !! 
		System.out.println("==list1 contents==");
		//System.out.println(list1);
		System.out.println(list1.toString()+" | "+list1.hashCode());
		
		System.out.println();
		
		System.out.println("==list2 contents==");
		System.out.println(list2+" | "+list2.hashCode());
		
		System.out.println();
		
		System.out.println("==list3 contents==");
		System.out.println(list3+" | "+list3.hashCode());
		
		System.out.println();
		
		//3. Size of List:
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		
		//4. Get data from list
		System.out.println("list1 0 index data is: "+list1.get(0));
		System.out.println("list2 2 index data is: "+list2.get(2));
		System.out.println("list3 1 index data is: "+list3.get(1));
		
		//5. Check for the data in list
		if(list2.contains("Jennie")){
			System.out.println("Jennie is in the list");
		}
		
		if(list3.contains(eRef1)){
			System.out.println(eRef1.name+" is in the list");
		}
		
		//6. Get the Index of Element in List
		int idx = list2.indexOf("John");
		System.out.println("idx is: "+idx);
		idx = list2.lastIndexOf("John");
		System.out.println("idx from last is: "+idx);
		
		//7. Remove an Element
		System.out.println("list2 before remove(0) is: "+list2+" | "+list2.size());
		list2.remove(0);
		System.out.println("list2 after remove(0) is: "+list2+" | "+list2.size());
		
		//8. Remove All
		//list2.clear();
		//System.out.println("list2 after clear() is: "+list2+" | "+list2.size());
		
		//9. Update Operation : with set method
		System.out.println("list2 before set is: "+list2+" | "+list2.size());
		list2.set(2, "George Watson");
		System.out.println("list2 after set is: "+list2+" | "+list2.size());
		
		// Above all operations are same for Homogeneous or Hetrogeous list !!
		System.out.println();
		// 10. Iterating in List i.e. element by element 
		// 10.1 : For Loop
		System.out.println("==For Loop==");
		for(int i=0;i<list1.size();i++){
			Object oRef = list1.get(i);	// Hetrogeneous, we don know the type of Object in the list. So as per RTP, Object is parent and can refere to any child
			System.out.println(oRef);		
		}
		System.out.println("=====");
		for(int i=0;i<list2.size();i++){
			String str = list2.get(i);
			System.out.println(str);
		}
		System.out.println("=====");
		for(int i=0;i<list3.size();i++){
			Employee emp = list3.get(i);
			System.out.println(emp);
		}
		
		System.out.println();
		
		// 10.2 : Enhanced For Loop
		System.out.println("==Enhanced For Loop==");
		for(Object oRef : list1){
			System.out.println(oRef);		
		}
		System.out.println("=====");
		for(String str : list2){
			System.out.println(str);
		}
		System.out.println("=====");
		for(Employee emp : list3){
			System.out.println(emp);
		}
		
		System.out.println();
		
		// 10.3 : Iterator API
		System.out.println("==Iterator==");
		Iterator itr1 = list1.iterator();
		/*System.out.println(itr1.next());
		System.out.println(itr1.next());
		System.out.println(itr1.next());*/
		while(itr1.hasNext()){
			Object oRef = itr1.next();
			System.out.println(oRef);
		}
		System.out.println("=====");
		Iterator<String> itr2 = list2.iterator();
		while(itr2.hasNext()){
			String str = itr2.next();
			System.out.println(str);
			
			if(str.equals("Jennie")){
				itr2.remove(); // Removes element from List !!
			}
			
		}
		System.out.println("=====");
		Iterator<Employee> itr3 = list3.iterator();
		while(itr3.hasNext()){
			Employee emp = itr3.next();
			System.out.println(emp);
		}
		
		System.out.println("List2 is: "+list2);
		
		System.out.println();
		
		// 10.4 : ListIterator API
		System.out.println("==ListIterator==");
		ListIterator listItr1 = list1.listIterator();
		/*System.out.println(listItr1.next());
		System.out.println(listItr1.next());
		System.out.println(listItr1.next());*/
		while(listItr1.hasNext()){
			Object oRef = listItr1.next();
			System.out.println(oRef);
		}
		System.out.println("=====");
		ListIterator<String> listItr2 = list2.listIterator();
		while(listItr2.hasNext()){
			String str = listItr2.next();
			System.out.println(str);
			
			if(str.equals("Jennie")){
				listItr2.remove(); // Removes element from List !!
			}	
		}
		System.out.println("----");
		while(listItr2.hasPrevious()){
			String str = listItr2.previous();
			System.out.println(str);
		}
		
		System.out.println("=====");
		ListIterator<Employee> listItr3 = list3.listIterator();
		while(listItr3.hasNext()){
			Employee emp = listItr3.next();
			System.out.println(emp);
		}
	
		System.out.println();
		
		// 10.5 : Enumeration API : just like Iterator without remove operation i.e. read only
		System.out.println("==Enumeration==");
		Enumeration<String> enm = Collections.enumeration(list2);
		while(enm.hasMoreElements()){
			String str = enm.nextElement();
			System.out.println(str);
		}
		
		System.out.println();
		
		System.out.println("List2 is: "+list2);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Leo");
		names.add("Mike");
		names.add("Kia");
		
		list2.addAll(names);
		System.out.println("List2 now is: "+list2);
		System.out.println("names is: "+names);
		
		// Thread-Safe i.e. Synchronized !!
		Vector<String> vector = new Vector<String>();
		vector.add("Leo");
		vector.add("Mike");
		vector.add("Kia");
		System.out.println("Vector Contents: "+vector);
		
		// Sorting Data in Collections
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("aAaA");
		strings.add("AaA");
		strings.add("aAa");
		strings.add("AAaa");
		Collections.sort(strings); // Employees ? -> Explore Comparable and Comparator
		
		for (String s : strings) {
			System.out.print(s + " ");
		}
	}

}
