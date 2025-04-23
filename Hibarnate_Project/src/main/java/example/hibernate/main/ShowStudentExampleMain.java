package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.Students;
import example.hibernate.utils.HibernateUtils;

public class ShowStudentExampleMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {
			Class<Students> entityType = Students.class;
			Object id = 103; // object id = new Integer(101);
			Students foundStd = session.find(entityType, id); // select * from student where studentid=101

			if (foundStd != null) {
				
				System.out.println("Found Student: " + foundStd);
				System.out.println("Student name: " + foundStd.getName());
				System.out.println("Student branch: " + foundStd.getBranch());
			}
			else
				System.out.println(" Student with given id not found");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
