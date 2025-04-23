package example.hibernate.one_to_many_unidirectional;

import java.util.Arrays;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LinkedCreditcardToCustomer {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {

			// load the data find() to finding Creditcard linked
			Creditcard c1 = session.find(Creditcard.class, "01");
			Creditcard c2 = session.find(Creditcard.class, "10");
			Creditcard c3 = session.find(Creditcard.class, "20");
			Creditcard c4 = session.find(Creditcard.class, "30");
			Creditcard c5 = session.find(Creditcard.class, "99");

			// load the data find() to finding Customer linked
			Customer cc1 = session.find(Customer.class, "c111");
			Customer cc2 = session.find(Customer.class, "c222");
			Customer cc3 = session.find(Customer.class, "c333");
			Customer cc4 = session.find(Customer.class, "c444");

			Transaction tx = session.beginTransaction();
			Collection<Creditcard> Allcards = Arrays.asList(c1, c2, c3, c4);
			cc1.setCreditcards(Allcards);
			cc4.addCreditCard(c5);
//			cc2.setCreditcards(Allcards);
			tx.commit();
			System.out.println("Creditcard mapping customers ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
/*Hibernate: select c1_0.card_no,c1_0.card_bankName,c1_0.credit_Limit,c1_0.card_Holder_Name,c1_0.card_type from Credit_card_master c1_0 where c1_0.card_no=?
Hibernate: select c1_0.card_no,c1_0.card_bankName,c1_0.credit_Limit,c1_0.card_Holder_Name,c1_0.card_type from Credit_card_master c1_0 where c1_0.card_no=?
Hibernate: select c1_0.card_no,c1_0.card_bankName,c1_0.credit_Limit,c1_0.card_Holder_Name,c1_0.card_type from Credit_card_master c1_0 where c1_0.card_no=?
Hibernate: select c1_0.card_no,c1_0.card_bankName,c1_0.credit_Limit,c1_0.card_Holder_Name,c1_0.card_type from Credit_card_master c1_0 where c1_0.card_no=?
Hibernate: select c1_0.card_no,c1_0.card_bankName,c1_0.credit_Limit,c1_0.card_Holder_Name,c1_0.card_type from Credit_card_master c1_0 where c1_0.card_no=?
Hibernate: select c1_0.customer_id,c1_0.emailAddress,c1_0.name from Customer_master c1_0 where c1_0.customer_id=?
Hibernate: select c1_0.customer_id,c1_0.emailAddress,c1_0.name from Customer_master c1_0 where c1_0.customer_id=?
Hibernate: select c1_0.customer_id,c1_0.emailAddress,c1_0.name from Customer_master c1_0 where c1_0.customer_id=?
Hibernate: select c1_0.customer_id,c1_0.emailAddress,c1_0.name from Customer_master c1_0 where c1_0.customer_id=?
Hibernate: select c1_0.customer_id,c1_0.card_no,c1_0.card_bankName,c1_0.credit_Limit,c1_0.card_Holder_Name,c1_0.card_type from Credit_card_master c1_0 where c1_0.customer_id=?
Hibernate: update Credit_card_master set customer_id=null where customer_id=?
Hibernate: update Credit_card_master set customer_id=? where card_no=?
Hibernate: update Credit_card_master set customer_id=? where card_no=?
Hibernate: update Credit_card_master set customer_id=? where card_no=?
Hibernate: update Credit_card_master set customer_id=? where card_no=?
Hibernate: update Credit_card_master set customer_id=? where card_no=?
Hibernate: update Credit_card_master set customer_id=? where card_no=?
Hibernate: update Credit_card_master set customer_id=? where card_no=?
Hibernate: update Credit_card_master set customer_id=? where card_no=?
Creditcard mapping customers 
 * */
