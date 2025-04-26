package com.bookshop.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import com.bookshop.entity.Book;
import com.bookshop.utils.HibernateUtils;

public class BookDao {
	public boolean save(Book book) {
		boolean status = false;
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {
			Transaction tx = session.beginTransaction();
			session.persist(book);
			tx.commit();
			status = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public List<Book> findAllBooks() {
		List<Book> books = null;
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {

			// get all object
			String hql = "SELECT b FROM Book b";
			Query<Book> queryBook = session.createQuery(hql, Book.class);
//			books = (List<Book>) queryBook; // or
			books = queryBook.list();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return books;
	}

	/*public Optional<Book> findByTitle(String title) {
	    try (Session session = HibernateUtils.getSessionFactory().openSession()) {
	        String hql = "SELECT b FROM Book b WHERE b.title = :bookTitle";
	        Book book = session.createQuery(hql, Book.class)
	                           .setParameter("bookTitle", title)
	                           .uniqueResult();
	        return Optional.ofNullable(book);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return Optional.empty();
	    }
	}*/
	public Book findByTitle(String title) {
	    try (Session session = HibernateUtils.getSessionFactory().openSession()) {
	        String hql = "FROM Book b WHERE b.title = :bookTitle";
	        return session.createQuery(hql, Book.class)
	                      .setParameter("bookTitle", title)
	                      .uniqueResult();
	    } catch (Exception e) {
	        e.printStackTrace();
	        return null;
	    }
	}


}
