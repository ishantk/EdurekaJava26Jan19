package co.edureka.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		
		Ride ride = context.getBean("rideProxy", Ride.class);
		System.out.println(ride);
		
		ride.bookRide(10, false);
		
		//ProxyFactoryBean -> Configure this class in XML File
	}

}
