package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Customer;

public class OneToOneApp {

	public static void main(String[] args) {
		
		Customer cRef = new Customer();
		cRef.setName("John Watson");
		cRef.setEmail("john.w@example.com");
		
		
		Address aRef = new Address();
		aRef.setAdrsLine("Redwood Shores");
		aRef.setCity("Bengaluru");
		aRef.setState("Karnataka");
		aRef.setZipCode(520001);
		
		// One to One Mapping between Objects
		/*
		cRef.setAddress(aRef);
		aRef.setCustomer(cRef);
		*/
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); 						// Read hibernte.cfg.xml file and Parse it

			
			factory = config.buildSessionFactory(); 	// To Create Session
			
			session = factory.openSession(); 			// Creating Connection to DB
			
			transaction = session.beginTransaction();	// Begin Transaction to perform any SQL Operation 
			
			session.save(cRef); // We are just saving Customer Object and Address Object shall be saved automatically
			
			// transaction.commit() will now save 100 objects all together as a batch
			transaction.commit();						// Commit Transaction to perform SQL Operations
			
			System.out.println(">> DB Operation Finished");
			
		} catch (Exception e) {
			System.out.println("Some Exception:"+e);
		}finally{
			session.close();
			factory.close();
		}

	}

}
