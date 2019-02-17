package co.edureka;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		// Key is Integer and Value is String (but, key and value can be any type)
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(101, "Jennie");
		map.put(123, "John");
		map.put(345, "Sia");
		map.put(77, "Jennie");
		map.put(99, "Kim");
		map.put(null, "Harry"); // null key is allowed
		map.put(222, null);  	// null value is also allowed
		// Keys are unique But Values can be Same/Duplicate
		
		// if we try to use the same key again:
		map.put(99, "Leo"); // Value for key is updated !! (Update Operation)
		
		System.out.println("map is: "+map);
		
		System.out.println("Map size is: "+map.size());
		if(map.containsKey(101)){
			System.out.println("101 key is in the map");
		}
		
		if(map.containsValue("Harry")){
			System.out.println("Harry is in the map");
		}
		
		String name = map.get(77);
		System.out.println("name is: "+name);
		
		Set<Integer> keys = map.keySet(); // To get all the keys from map
		System.out.println("Keys in Map: "+keys);
		
		// 1. using iterator
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			
			System.out.println(key+"\t"+value);
		}
		
		//2. using entry set
		Set<Entry<Integer, String>> entries = map.entrySet();
		System.out.println(entries);
		
		// Entry<Integer, String> -> key value pair of map
		
		System.out.println();
		Iterator<Entry<Integer, String>> itr1 = entries.iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		// Hashtable is Thread-Safe i.e. Synchronized
		// If 2 threads are working on same Hashtable lock will be acquired !!
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(101, "Jennie");
		table.put(123, "John");
		table.put(345, "Sia");
		table.put(77, "Jennie");
		table.put(99, "Kim");
		//table.put(null, "Fionna"); 	// exception : no null keys allowed
		//table.put(111, null); 		// exception : no null values allowed
		System.out.println("table is "+table);
	}

}
