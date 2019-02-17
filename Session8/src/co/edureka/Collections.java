package co.edureka;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

class Product{
	int pid;
	String name;
	int price;
}

public class Collections {

	public static void main(String[] args) {
		
		ArrayList<HashMap<Integer, String>> list = new ArrayList<HashMap<Integer, String>>();
		HashMap<ArrayList<Integer>, HashSet<String>> map = new HashMap<ArrayList<Integer>, HashSet<String>>();
		
		Product p1 = new Product();
		p1.pid = 101;
		p1.name = "iPhoneX";
		p1.price = 80000;
		
		Product p2 = new Product();
		p2.pid = 201;
		p2.name = "Samsung LED TV";
		p2.price = 50000;
		
		ArrayList<Product> cart = new ArrayList<Product>();
		cart.add(p1);
		cart.add(p2);

	}

}
