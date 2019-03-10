package co.edureka.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Connection;

public class App {

	public static void main(String[] args) {
		
		// Traditional way of Constructing Objects in Java
		
		Connection con1 = new Connection();
		con1.setDriver("com.mysql.jdbc.Driver");
		con1.setUrl("jdbc:mysql://localhost/edureka");
		con1.setUser("john");
		con1.setPassword("john123");
		
		Connection con2 = new Connection();
		con2.setDriver("com.mysql.jdbc.Driver");
		con2.setUrl("jdbc:mysql://localhost/edureka");
		con2.setUser("fionna");
		con2.setPassword("fionna123");
		
		System.out.println(con1);
		System.out.println(con2);
		
		// Challenge: If we need to change user or password or db or url i.e. any property
		//			  We need to make changes in source code. Which means re-compilation and releasing the software again to the customer !!
		//			  Objects which holds configuration data can be a challenge !!
		
		// Spring FW: Inversion of Control (IOC)
		// IOC says you don't create objects !! You configure data for objects in an XML File !!
		// IOC Container will read the XML file and construct and manage objects for us
		// We just get the reference of object constructed by IOC Container and use it !!
		// If we wish to manipulate data in Object, we shall just modify XML File and we are done !! No Changes in the Java Source Code required !!
		
		/*
		 	Spring Procedure:
		 	1. Create a Bean or Model or POJO
		 	2. Create a class with main method
		 	3. Link Spring Core Jar File with your Project (Configure Build Path)
		 	4. Copy anyname.xml file in src directory and edit it with your object configuration
		 	5. Use IOC Container to get the Objects
		 		5.1. BeanFactory
		 		5.2. ApplicationContext
		 */
		
		System.out.println("******Spring FW*******");
		
		
		//System.out.println("**** BeanFactory *****");
		
		// Implementation of IOC Container : BeanFactory
		//Resource resource = new ClassPathResource("beans.xml"); // Read the XMl File
		//BeanFactory factory = new XmlBeanFactory(resource);		// Create and Manage Objects from XML File 
		
		// We are getting the reference to the Object. Object is constructed by IOC Container !!
		/*Connection cRef1 = (Connection)factory.getBean("c1");
		Connection cRef2 = factory.getBean("c2", Connection.class);
		
		System.out.println(cRef1);
		System.out.println(cRef2);*/
		
		System.out.println("**** ApplicationContext *****");
		// Implementation of IOC Container : ApplicationContext
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Connection cRef1 = (Connection)context.getBean("c1");
		//Connection cRef2 = context.getBean("c2", Connection.class);
		
		// We are getting the reference to the same object again in a different ref variable cRef3
		//Connection cRef3 = context.getBean("c1", Connection.class);
		
		System.out.println(cRef1);
		//System.out.println(cRef2);
		//System.out.println(cRef3);
		
		
		// Downcast ClassPathXmlApplicationContext
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context;
		cxt.close(); // Closing the IOC Container
		
	}

}
