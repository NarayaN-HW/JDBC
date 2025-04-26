package com.bookshop.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.bookshop.entity.Author;
import com.bookshop.utils.HibernateUtils;

public class AuthorDao {
	public boolean save(Author author) {
		boolean status = false;
		try (SessionFactory factory = HibernateUtils.getSessionFactory();
				Session session = factory.openSession();) {
			Transaction tx = session.beginTransaction();
			session.persist(author);
			tx.commit();
			status = true;
			System.out.println("author added successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	public Author findAuthorNameandEmail(String name, String email) {
		Author foundauthor = null;
		try (SessionFactory factory = HibernateUtils.getSessionFactory(); Session session = factory.openSession();) {

			// get all object
			String hql = "SELECT a FROM Author  a where a.authorName =:authName and  a.email=:authEmail";
			foundauthor = session.createQuery(hql, Author.class).setParameter("authName", name)
					.setParameter("authEmail", email).uniqueResult(); // get unigue details

		} catch (Exception e) {
			e.printStackTrace();
		}
		return foundauthor;
	}
}
