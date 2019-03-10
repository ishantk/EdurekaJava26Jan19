package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import co.edureka.model.Employee;


/*
 	Hibernate Procedure:
 	1. Create POJO Class
 	2. Create App Class with main method
 	3. Link all the hibernate jars with your project in Eclipse (Configure Build Path) | Type-4 Driver and hibernate Jars
 	4. Copy cfg and hbm file which are xml files in src directory
 	5. Edit the files for your DB Specific and Table specific information
 	6. Write Java Code with Hibernate API's to perform DB Operation
 */

public class App {

	public static void main(String[] args) {
		
		// Objects containing data
		// Objects are temporary and we must save the data !! -> Persistent Objects (For which we need to save data)
		Employee emp1 = new Employee(null,"George","george@example.com",50000,"R&D");
		Employee emp2 = new Employee(null,"Kim","kim@example.com",60000,"Admin");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		AnnotationConfiguration aConfig = null;
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Session session2 = null;
		Transaction transaction = null;
		
		try {
			
			//config = new Configuration();
			//config.configure(); 						// Read hibernte.cfg.xml file and Parse it
			
			aConfig = new AnnotationConfiguration();	// If we have mapping done as annotations
			aConfig.configure();
			
			//factory = config.buildSessionFactory(); 	// To Create Session
			factory = aConfig.buildSessionFactory(); 	// To Create Session
			
			// 1st session
			session = factory.openSession(); 			// Creating Connection to DB
			
			//2nd session
			session2 = factory.openSession();
			
			transaction = session.beginTransaction();	// Begin Transaction to perform any SQL Operation 
			
			// SQL Operation taken care by Session API
			
			// Insert Operation
			//session.save(emp1);							
			//session.save(emp2);
			
			
			// Fetch Single Record Operation (Fire SQL Query > Conversion of Data into Employee Object)
			Employee eRef1 = (Employee)session.get(Employee.class, 2);
			System.out.println(eRef1);
			
			//We are fetching the same object again !!
			Employee eRef2 = (Employee)session.get(Employee.class, 2);
			System.out.println(eRef2);
			
			// Update Operation | First we should perform fetch operation and than update the data
			//eRef.setName("Sia Watson");
			//eRef.setSalalry(77911);
			
			//session.update(eRef);
			
			// Delete Operation
			/*Employee emp = new Employee();
			emp.setEid(3);
			session.delete(emp); // Delete Employee with eid as 3
			*/
			
			// Retrieve All Operation:
			// 1. HQL i.e. Hibernate Query Language
			//String hql  = "From Employee"; // This is like SQL
			//String hql  = "From Employee where salary > 60000"; // This is like SQL
			
			// We directly get Collection of Employee Objects 
			//List<Employee> employees = session.createQuery(hql).list();
			//for(Employee emp : employees){
			//	System.out.println(emp);
			//}
			
			//session.createSQLQuery() | RAW SQL Queries
			
			//2. Criteria API
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salalry", 55000));
			
			List<Employee> employees = criteria.list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			
			// Batch operation
			/*for(int i=1;i<=100;i++){
				Employee emp = new Employee(null, "Employee"+i, "emp"+i+"@example.com", 30000+i, "Sales");
				session.save(emp);  // 100 Employee Objects shall be saved in session
			}*/
			
			// transaction.commit() will now save 100 objects all toigether as a batch
			transaction.commit();						// Commit Transaction to perform SQL Operations
			
			System.out.println(">> DB Operation Finished");
			
		} catch (Exception e) {
			System.out.println("Some Exception:"+e);
		}finally{
			session.close(); // Till Session is not closed, we can fetch the same data with no additional SQL Query fired 
			factory.close(); // For multiple Session Objects, data shall be maintained in Cache
		}
		
	}

}
