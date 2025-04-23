package example.hibernate.hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import example.hibernate.entity.Students;

public class FromClauseExampleMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();

		) {
//String sqlQuery ="select * from student_details";
			 String hqlQuery = "from Students s";
			// String hqlQuery = "from Students s where s.year = 'Completed'";
			//String hqlQuery = "from Students s where s.year = 'secondyear'";

//			Parameters:queryString a Jakarta Persistence query stringresultClass the type of the query result
			Query<Students> queryStudObj = session.createQuery(hqlQuery, Students.class);
			List<Students> listofStudentObj = queryStudObj.list();

//			for (Students s : listofStudentObj)
//				System.out.println(s);
			//listofStudentObj.stream().forEach(n -> System.out.println(n));
			listofStudentObj.stream().forEach(n -> System.out.println(n.getName()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
