package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.CA;
import co.edureka.model.CB;
import co.edureka.model.CC;

public class InheritanceApp {

	public static void main(String[] args) {
		
		CA ca = new CA();
		ca.setA(10);
		
		CB cb = new CB();
		cb.setA(100);
		cb.setB(200);
		
		CC cc = new CC();
		cc.setA(1000);
		cc.setB(2000);
		cc.setC(3000);
		
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
			
			session.save(ca);
			session.save(cb);
			session.save(cc);
			
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
