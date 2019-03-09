package co.edureka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Address;
import co.edureka.model.Customer;

public class OneToManyApp {

	public static void main(String[] args) {
		/*
		Customer cRef = new Customer();
		cRef.setName("Fionna");
		cRef.setEmail("fionna@example.com");
		
		Address aRef1 = new Address(null, "Redwood Shores", "Pune", "Maharashtra", 420001);
		Address aRef2 = new Address(null, "Country Homes", "Pune", "Maharashtra", 420002);
		Address aRef3 = new Address(null, "Pristine Magnum", "Bengaluru", "Karnataka", 520003);
		
		List<Address> adrsList = new ArrayList<>();
		adrsList.add(aRef1); //0
		adrsList.add(aRef2); //1
		//adrsList.add(aRef3); //2
		
		cRef.setAddresses(adrsList);
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
			
			//session.save(cRef); 						// We are just saving Customer Object and Address Object List shall be saved automatically
			
			Customer customer = (Customer)session.get(Customer.class, 2);
			System.out.println(customer);
			
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
