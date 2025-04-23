package example.hibernate.hql;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import example.hibernate.bean.StudentData;

public class ConstructorExpressionExampleMain {
	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {
//			constructor expression create new data class requred fields/column/mem var only / and perfrom this query
			String hqlQuery = "SELECT new example.hibernate.bean.StudentData(s.name,s.branch,s.year) from Students s";
			Query<StudentData> queryObj = session.createQuery(hqlQuery, StudentData.class);
			List<StudentData> allstdData = queryObj.list();

			allstdData.stream().forEach(s -> System.out.println(s));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
