package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.CB;

public class AutowiringApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		
		CB cRef = context.getBean("cb",CB.class);
		cRef.getCa().sayHello("George");

	}

}
