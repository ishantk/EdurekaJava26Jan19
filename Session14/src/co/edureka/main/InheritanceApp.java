package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.model.LEDTV;
import co.edureka.model.TV;

public class InheritanceApp {

	public static void main(String[] args) {
		
		// IOC Container : Will Create Objects for us !!
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance.xml");
		
		System.out.println();
		
		TV tRef = context.getBean("t1", TV.class);
		System.out.println(tRef);
		
		System.out.println();
		
		LEDTV lRef = context.getBean("l1", LEDTV.class);
		System.out.println(lRef);
	}

}
