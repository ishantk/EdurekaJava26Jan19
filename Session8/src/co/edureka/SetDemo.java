package co.edureka;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>(); // Sorted Version of HashSet
		set.add("Leo");
		set.add("Mike");
		set.add("Leo");
		set.add("John");
		set.add("Sia");
		set.add("John");
		set.add("Annika");
		set.add("Fionna");
		
		// In above HashSet Leo and John are added twice i.e. duplicate data
		System.out.println(set);
		
		//1. No Duplicates will be added
		//2. Data is added using Hashing technique and not as in indexed approach !! (Explore Hashing)
		// we cannot get data from set as we have no indexes !!
		
		Iterator<String> itr = set.iterator();
		/*System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());*/
		
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println("name is: "+name);
		}
		
		if(set.contains("John")){
			System.out.println("John is in the set");
		}
		
		set.remove("John");
		
		System.out.println("set now is: "+set);
		System.out.println("size of set is: "+set.size());

	}

}
