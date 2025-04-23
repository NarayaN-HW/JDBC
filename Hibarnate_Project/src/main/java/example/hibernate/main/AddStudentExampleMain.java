package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import example.hibernate.entity.Students;
import example.hibernate.utils.HibernateUtils;

public class AddStudentExampleMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();

		) {
			Students studentObj = new Students(105, "ganisha", "selenium", "SecondYear");
			Transaction tx = session.beginTransaction(); // used ddl commands auto commit false
			session.persist(studentObj);
			tx.commit();
			System.out.println("record added successfully...");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
