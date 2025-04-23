package example.hibernate.one_to_many_unidirectional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.one_to_many_unidirectional.Creditcard;

public class AddCreditcardExampleMain {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {
			Creditcard c1 = new Creditcard("99", "narayana", "sbi", "MASTERCARD", 2000000);
			Creditcard c2 = new Creditcard("10", "yana", "AXIS", "Rupa", 2000000);
			Creditcard c3 = new Creditcard("30", "NEVDA", "HDFC", "VISA", 3000000);
			Creditcard c4 = new Creditcard("20", "nara", "ICICI", "VISA", 4000000);
			Creditcard c5 = new Creditcard("01", "Shiva", "none", "God", 50000000);

			Transaction tx = session.beginTransaction();
			session.persist(c1);
			session.persist(c2);
			session.persist(c3);
			session.persist(c4);
			session.persist(c5);
			tx.commit();
			System.out.println("CreditCard added succesfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
/*Hibernate: create table Credit_card_master (card_no varchar(30) not null, card_bankName varchar(30), credit_Limit integer, card_Holder_Name varchar(30), card_type varchar(30), customer_id varchar(255), primary key (card_no)) engine=InnoDB
Hibernate: create table Customer_master (customer_id varchar(255) not null, emailAddress varchar(255), name varchar(255), primary key (customer_id)) engine=InnoDB
Hibernate: alter table Credit_card_master add constraint FKcqysnmo7b60e2bfauxhuggvkf foreign key (customer_id) references Customer_master (customer_id)
Hibernate: insert into Credit_card_master (card_bankName,credit_Limit,card_Holder_Name,card_type,card_no) values (?,?,?,?,?)
Hibernate: insert into Credit_card_master (card_bankName,credit_Limit,card_Holder_Name,card_type,card_no) values (?,?,?,?,?)
Hibernate: insert into Credit_card_master (card_bankName,credit_Limit,card_Holder_Name,card_type,card_no) values (?,?,?,?,?)
Hibernate: insert into Credit_card_master (card_bankName,credit_Limit,card_Holder_Name,card_type,card_no) values (?,?,?,?,?)
Hibernate: insert into Credit_card_master (card_bankName,credit_Limit,card_Holder_Name,card_type,card_no) values (?,?,?,?,?)
CreditCard added succesfully...
 */