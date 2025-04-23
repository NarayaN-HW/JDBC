package example.hibernate.one_to_many_unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.one_to_many_unidirectional.Creditcard;
import example.hibernate.one_to_many_unidirectional.Customer;

public class AddCustomerExampleMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {

			Customer c1 = new Customer("c111", "narayana", "narayana@gmail.com", null);
			Customer c2 = new Customer("c222", "yana", "yana@gmail.com", null);
			Customer c3 = new Customer("c333", "NEVDA", "nevda@gmail.com", null);
			Customer c4 = new Customer("c444", "Shiva", "Shiva@gmail.com", null);
			
			
			Transaction tx = session.beginTransaction();
			session.persist(c1);
			session.persist(c2);
			session.persist(c3);
			session.persist(c4);
			tx.commit();
			System.out.println("Customer added succesfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
/*Hibernate: insert into Customer_master (emailAddress,name,customer_id) values (?,?,?)
Hibernate: insert into Customer_master (emailAddress,name,customer_id) values (?,?,?)
Hibernate: insert into Customer_master (emailAddress,name,customer_id) values (?,?,?)
Hibernate: insert into Customer_master (emailAddress,name,customer_id) values (?,?,?)
Customer added succesfully...
 */