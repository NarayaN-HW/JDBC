package example.hibernate.one_to_one_unidirectional;

import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AddPassportExampleMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {
			Passport p1 = new Passport("p001", "narayan patil", LocalDate.of(2029, 9, 12));
			Passport p2 = new Passport("p002", "shiva", LocalDate.of(2030, 9, 12));
			Transaction tx = session.beginTransaction();
			session.persist(p1);
			session.persist(p2);
			tx.commit();
			System.out.println("Passpord added succesfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
/*
 * Hibernate: create table Employee_master (emp_no integer not null, emp_name
 * varchar(40), emp_sal integer, passport_no varchar(30), primary key (emp_no))
 * engine=InnoDB Hibernate: create table Passport_master (passport_no
 * varchar(30) not null, passport_exp_date date, passport_holder_Name
 * varchar(30), primary key (passport_no)) engine=InnoDB Hibernate: alter table
 * Employee_master drop index UK_adltt6bm5bcs43fd5ubjndjfr Hibernate: alter
 * table Employee_master add constraint UK_adltt6bm5bcs43fd5ubjndjfr unique
 * (passport_no) Hibernate: alter table Employee_master add constraint
 * FKpf6ewial0og8eb8osp9c3yvnh foreign key (passport_no) references
 * Passport_master (passport_no) Hibernate: insert into Passport_master
 * (passport_exp_date,passport_holder_Name,passport_no) values (?,?,?)
 * Hibernate: insert into Passport_master
 * (passport_exp_date,passport_holder_Name,passport_no) values (?,?,?) Passpord
 * added succesfully...
 */