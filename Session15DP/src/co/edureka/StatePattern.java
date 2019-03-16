package co.edureka;

interface State{
	String showState();
}

class InitialState implements State{
	
	public String showState() {
		return "Customer has processed the Payments";
	}
}

class ReceivedState implements State{
	
	public String showState() {
		return "Restaurant has accepted the Order";
	}
}

class ShippedState implements State{
	
	public String showState() {
		return "Restaurant has shipped the Order with Delivery Person";
	}
}

class DeliveredState implements State{
	
	public String showState() {
		return "Delivery Person handed the order to the Customer";
	}
}


class Order{
	
	State state; // Has-A state
	
	void changeState(State state){
		this.state = state;
	}
	
	State getState(){
		return state;
	}
	
}

public class StatePattern {

	public static void main(String[] args) {

		InitialState iState = new InitialState();
		ReceivedState rState = new ReceivedState();
		ShippedState sState = new ShippedState();
		DeliveredState dState = new DeliveredState();
		
		Order order = new Order();
		order.changeState(iState);
		System.out.println(">> State of Order: "+order.getState().showState());
		
		System.out.println();
		order.changeState(rState);
		System.out.println(">> State of Order: "+order.getState().showState());
		
		System.out.println();
		order.changeState(sState);
		System.out.println(">> State of Order: "+order.getState().showState());
		
		System.out.println();
		order.changeState(dState);
		System.out.println(">> State of Order: "+order.getState().showState());
		
		
	}

}
