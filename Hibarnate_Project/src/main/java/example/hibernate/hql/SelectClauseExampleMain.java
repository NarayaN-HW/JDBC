package example.hibernate.hql;

import java.util.List;
import java.util.function.Consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class SelectClauseExampleMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();

		) {
//String sqlQuery ="select student_name,student_branch from student_details";
			String hqlQuery = "SELECT s.name,s.branch FROM Students s";// s alies, Student nick name is s
			Query<Object[]> queryObjArr = session.createQuery(hqlQuery, Object[].class);
			List<Object[]> studentDataArray = queryObjArr.list();

			for (Object[] s : studentDataArray) {
//				System.out.println(s[0] + " =- \t" + s[1]);
				System.out.println((s[0] + "\t=\t" + s[1]).toUpperCase());
			}
			System.out.println("---------------------------\n");
			Consumer<Object[]> consumerObj = studentinfoArr -> {
				/*
				 * String name = (String) studentinfoArr[0]; String branch = (String)
				 * studentinfoArr[1];
				 * System.out.println(name.toUpperCase()+", "+branch.toUpperCase());
				 */
				System.out.println((studentinfoArr[0] + "," + studentinfoArr[1]).toUpperCase());
			};
			studentDataArray.stream().forEach(consumerObj);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
