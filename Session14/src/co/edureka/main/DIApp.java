package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.Address;
import co.edureka.model.Customer;

public class DIApp {

	public static void main(String[] args) {
		
		/*
		Customer cRef = new Customer();
		Address aRef = new Address();
		
		cRef.setAddress(aRef); // Low Coupling
		
		Address aRef2 = new Address();
		Customer cRef2 = new Customer(aRef2); // Low Coupling
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
		
		Address aRef1 = context.getBean("a1", Address.class);
		System.out.println(aRef1);
		
		Customer cRef1 = context.getBean("c1", Customer.class);
		System.out.println(cRef1);
		
		System.out.println("Customer Cards:");
		System.out.println(cRef1.getCards());
	}

}
