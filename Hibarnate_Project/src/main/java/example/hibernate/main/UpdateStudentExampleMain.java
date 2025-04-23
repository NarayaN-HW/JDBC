package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import example.hibernate.entity.Students;
import example.hibernate.utils.HibernateUtils;

public class UpdateStudentExampleMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {
			Class<Students> entityType = Students.class;
			Object id = 103;
//			transistent obj not arrived bec we use hibernate obj not java obj using new
			Students foundStd = session.find(entityType, id); // getting obj from hibernate

			if (foundStd != null) {
				Transaction tx = session.beginTransaction();
				foundStd.setBranch("Comp Science");

				foundStd.setYear("Completed");
				tx.commit();
				System.out.println("Record updated successfully...");
			} else
				System.out.println("Student with given id not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
