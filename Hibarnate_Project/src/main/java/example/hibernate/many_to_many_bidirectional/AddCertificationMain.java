package example.hibernate.many_to_many_bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddCertificationMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {
			Certification c1 = new Certification("SM", "SCRUM MASTER", null);
			Certification c2 = new Certification("MCD", "MICROSOFT CERTIFIED", null);
			Certification c3 = new Certification("AA", "AWS ADMIN", null);
			Transaction tx = session.beginTransaction();
			session.persist(c1);
			session.persist(c2);
			session.persist(c3);
			tx.commit();
			System.out.println("Certificated added successfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
/*ibernate: insert into certification_master (name,certification_code) values (?,?)
Hibernate: insert into certification_master (name,certification_code) values (?,?)
Hibernate: insert into certification_master (name,certification_code) values (?,?)
Certificated added successfully...
 */
