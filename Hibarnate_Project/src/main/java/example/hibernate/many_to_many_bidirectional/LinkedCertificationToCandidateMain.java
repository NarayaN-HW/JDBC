package example.hibernate.many_to_many_bidirectional;

import java.util.Arrays;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LinkedCertificationToCandidateMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {

			// finding candidate find()
			Certification c1 = session.find(Certification.class, "AA");
			Certification c2 = session.find(Certification.class, "SM");
			Certification c3 = session.find(Certification.class, "MCD");

			// find certification find()
			Candidate cc1 = session.find(Candidate.class, 101);
			Candidate cc2 = session.find(Candidate.class, 102);

//			
			Transaction tx = session.beginTransaction();
			cc1.addCandidates(c1);
			cc1.addCandidates(c2);

			Collection<Certification> allcerti = Arrays.asList(c1, c2, c3);
			cc2.setCandidates(allcerti);

			tx.commit();

			System.out.println("Linked CERTIFICATION - CANDIDATE gether successfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
/*Hibernate: select c1_0.certification_code,c1_0.name from certification_master c1_0 where c1_0.certification_code=?
Hibernate: select c1_0.certification_code,c1_0.name from certification_master c1_0 where c1_0.certification_code=?
Hibernate: select c1_0.certification_code,c1_0.name from certification_master c1_0 where c1_0.certification_code=?
Hibernate: select c1_0.candidateId,c1_0.cNames from Candidate_master c1_0 where c1_0.candidateId=?
Hibernate: select c1_0.candidateId,c1_0.cNames from Candidate_master c1_0 where c1_0.candidateId=?
Hibernate: select c1_0.cand_Id,c1_1.certification_code,c1_1.name from candidate_certification_master c1_0 join certification_master c1_1 on c1_1.certification_code=c1_0.certi_id where c1_0.cand_Id=?
Hibernate: delete from candidate_certification_master where cand_Id=?
Hibernate: insert into candidate_certification_master (cand_Id,certi_id) values (?,?)
Hibernate: insert into candidate_certification_master (cand_Id,certi_id) values (?,?)
Hibernate: insert into candidate_certification_master (cand_Id,certi_id) values (?,?)
Hibernate: insert into candidate_certification_master (cand_Id,certi_id) values (?,?)
Hibernate: insert into candidate_certification_master (cand_Id,certi_id) values (?,?)
Linked CERTIFICATION - CANDIDATE gether successfully...
 */
