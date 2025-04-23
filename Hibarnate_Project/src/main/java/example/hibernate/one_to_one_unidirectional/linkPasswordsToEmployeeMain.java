package example.hibernate.one_to_one_unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class linkPasswordsToEmployeeMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {

			// load the data find() to finding password linked
			Passport p1 = session.find(Passport.class, "p001"); // persistent state
			Passport p2 = session.find(Passport.class, "p002");

			// load the data find() to finding Employee linked
			Employee e1 = session.find(Employee.class, 010);
			Employee e2 = session.find(Employee.class, 020);

			// start transaction
			Transaction tx = session.beginTransaction();
			e1.setPassportDetails(p1);
			e2.setPassportDetails(p2);
			tx.commit();
			System.out.println("Passport hasbeen linked succesfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
/*Hibernate: select p1_0.passport_no,p1_0.passport_exp_date,p1_0.passport_holder_Name from Passport_master p1_0 where p1_0.passport_no=?
Hibernate: select p1_0.passport_no,p1_0.passport_exp_date,p1_0.passport_holder_Name from Passport_master p1_0 where p1_0.passport_no=?
Hibernate: select e1_0.emp_no,e1_0.emp_name,pd1_0.passport_no,pd1_0.passport_exp_date,pd1_0.passport_holder_Name,e1_0.emp_sal from Employee_master e1_0 left join Passport_master pd1_0 on pd1_0.passport_no=e1_0.passport_no where e1_0.emp_no=?
Hibernate: select e1_0.emp_no,e1_0.emp_name,pd1_0.passport_no,pd1_0.passport_exp_date,pd1_0.passport_holder_Name,e1_0.emp_sal from Employee_master e1_0 left join Passport_master pd1_0 on pd1_0.passport_no=e1_0.passport_no where e1_0.emp_no=?
Hibernate: update Employee_master set emp_name=?,passport_no=?,emp_sal=? where emp_no=?
Hibernate: update Employee_master set emp_name=?,passport_no=?,emp_sal=? where emp_no=?
Passport hasbeen linked succesfully...
 */