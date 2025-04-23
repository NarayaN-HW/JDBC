package example.hibernate.one_to_one_unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddEmployeeExampleMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {
			Employee e1 = new Employee(010, "narayana", 500000, null);
			Employee e2 = new Employee(020, "nevdaa", 600000, null);

			Transaction tx = session.beginTransaction();
			session.persist(e1);
			session.persist(e2);
			tx.commit();
			System.out.println("Employee added succesfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
/*
 * Hibernate: insert into Employee_master (emp_name,passport_no,emp_sal,emp_no)
 * values (?,?,?,?) Hibernate: insert into Employee_master
 * (emp_name,passport_no,emp_sal,emp_no) values (?,?,?,?) Employee added
 * succesfully...
 */