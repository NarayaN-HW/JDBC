package example.hibernate.many_to_many_bidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class AddCandidateMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {
			Candidate c1 = new Candidate(101, "narayan", null);
			Candidate c2 = new Candidate(102, "yana", null);
			Transaction tx = session.beginTransaction();
			session.persist(c1);
			session.persist(c2);
			tx.commit();
			System.out.println("Candidate added successfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

}
/*Hibernate: create table candidate_certification_master (cand_Id integer not null, certi_id varchar(5) not null) engine=InnoDB
Hibernate: create table Candidate_master (candidateId integer not null, cNames varchar(255), primary key (candidateId)) engine=InnoDB
Hibernate: create table certification_master (certification_code varchar(5) not null, name varchar(255), primary key (certification_code)) engine=InnoDB
Hibernate: alter table candidate_certification_master add constraint FKt0u4jlk6wnk2hh45stf7xqeh1 foreign key (certi_id) references certification_master (certification_code)
Hibernate: alter table candidate_certification_master add constraint FKswho3vhe48jd895f0m2lcthpm foreign key (cand_Id) references Candidate_master (candidateId)
Hibernate: insert into Candidate_master (cNames,candidateId) values (?,?)
Hibernate: insert into Candidate_master (cNames,candidateId) values (?,?)
Candidate added successfully...*/
