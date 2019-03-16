package co.edureka;

interface Plan{
	void setDataForPlan();
	void showPlan();
}

class Plan2G implements Plan{
	
	int price;
	int data;

	public void setDataForPlan() {
		price = 200;
		data = 2;
	}
	public void showPlan() {
		System.out.println(">> Plan2G shall offer "+data+"GB of data for \u20b9"+price);
	}
	
}

class Plan3G implements Plan{
	
	int price;
	int data;

	public void setDataForPlan() {
		price = 300;
		data = 5;
	}
	public void showPlan() {
		System.out.println(">> Plan3G shall offer "+data+"GB of data for \u20b9"+price);
	}
	
}

class Plan4G implements Plan{
	
	int price;
	int data;

	public void setDataForPlan() {
		price = 500;
		data = 10;
	}
	public void showPlan() {
		System.out.println(">> Plan4G shall offer "+data+"GB of data for \u20b9"+price);
	}
	
}

class PlanFactory{
	
	public static Plan getPlan(int type){
		
		Plan plan = null;
		
		if(type == 2){
			plan = new Plan2G();
		}else if(type == 3){
			plan = new Plan3G();
		}else if(type == 4){
			plan = new Plan4G();
		}else{
			System.out.println(">> Invalid Choice");
		}
		
		plan.setDataForPlan();
		return plan;
		
	}
	
}


public class Factory {

	public static void main(String[] args) {
		
		// How Objects shall be created that logic is now not known to the end user
		Plan plan = PlanFactory.getPlan(4);
		plan.showPlan();

	}

}
