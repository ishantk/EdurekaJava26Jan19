package co.edureka;

interface FoodItem{
	String description();
	int price();
}

class Burger implements FoodItem{

	public String description() {
		return "Classic Veggie Burger";
	}

	public int price() {
		return 100;
	}
}

abstract class FoodItemDecortor implements FoodItem{
	
	FoodItem item;
	
	FoodItemDecortor(FoodItem item){
		this.item = item;
	}
	
	public String description() {
		return item.description();
	}

	public int price() {
		return item.price();
	}
	
}

class Meal extends FoodItemDecortor{
	
	Meal(FoodItem item){
		super(item);
	}
	
	public String description() {
		return item.description() + " With a Meal containing Fries and Coke";
	}

	public int price() {
		return item.price() + 100;
	}
}

public class Decorator {

	public static void main(String[] args) {
		
		Burger burger = new Burger();
		System.out.println("Details: "+burger.description());
		System.out.println("Price: "+burger.price());

		System.out.println();
		
		// Decorate Burger Object Dynamically
		FoodItem item = new Meal(burger);
		System.out.println("Details: "+item.description());
		System.out.println("Price: "+item.price());
		

	}

}
