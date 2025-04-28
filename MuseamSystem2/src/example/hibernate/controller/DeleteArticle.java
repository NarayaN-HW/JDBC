package example.hibernate.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.Article;
import example.hibernate.utils.HibernateUtils;


public class DeleteArticle {
	public static void main(String[] args) {
		try(SessionFactory factory=HibernateUtils.getSessionFactory();
				Session session=factory.openSession()
					){
			Class <Article> entityType=Article.class;
			Object id=2;
			Article foundArticle=session.find(entityType, id);
			if(foundArticle!=null)
			{
				Transaction tx=session.beginTransaction();
			session.remove(foundArticle);
				tx.commit();
				System.out.println("Article deleted SuccessFully!!");
			}
			else
				System.out.println("Article Does Not Exists!!!");
			}
}

}
