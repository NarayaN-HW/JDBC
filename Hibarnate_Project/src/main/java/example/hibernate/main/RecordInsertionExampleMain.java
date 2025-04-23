package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import example.hibernate.entity.Movie;

public class RecordInsertionExampleMain {

	public static void main(String[] args) {
		SessionFactory factory = null;
		Session session = null;
		Configuration conf = new Configuration();
		conf = conf.configure();
		try {
			factory = conf.buildSessionFactory();
			session = factory.openSession();
			Movie movieobj = new Movie(012, "Fiftyshades", "romance", 2001);
			Transaction tx = session.beginTransaction(); // load transaction
//			session.save(movieobj); // depricitate 
			session.persist(movieobj); // to stored data
			tx.commit();
			System.out.println("record inserted successfully...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}

}
/*
 * Hibernate: create table Movie_Details (movie_id integer not null, movie_title
 * varchar(255), movie_genre varchar(255), movie_year integer, primary key
 * (movie_id)) engine=InnoDB Hibernate: insert into Movie_Details
 * (movie_genre,movie_title,movie_year,movie_id) values (?,?,?,?) record
 * inserted successfully...
 * 
 * mysql> use box_office; Database changed
 * 
 * mysql> select * from movie_details;
 * +----------+--------------+-------------+------------+ | movie_id |
 * movie_title | movie_genre | movie_year |
 * +----------+--------------+-------------+------------+ | 8 | Child's Play |
 * horror | 1992 | +----------+--------------+-------------+------------+ 1 row
 * in set (0.00 sec)
 * 
 * 
 * mysql> select * from movie_details;
 * +----------+--------------+-------------+------------+ | movie_id |
 * movie_title | movie_genre | movie_year |
 * +----------+--------------+-------------+------------+ | 8 | Child's Play |
 * horror | 1992 | | 10 | Fiftyshades | romance | 2001 |
 * +----------+--------------+-------------+------------+ 2 rows in set (0.00
 * sec)
 */
