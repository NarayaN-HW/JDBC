package example.hibernate.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.entity.Article;
import example.hibernate.utils.HibernateUtils;

public class ShowAllArticles {
	
	    public static void main(String[] args) {
	        try (SessionFactory factory = HibernateUtils.getSessionFactory();
	             Session session = factory.openSession()) {
	        	session.beginTransaction();
	        	String hql = "from Article";
	            Query<Article> query = session.createQuery(hql, Article.class);
	            List<Article> articles = query.list();
                if (articles.isEmpty()) {
	                System.out.println("No articles found.");
	            } else {
	                System.out.println("Articles:");
	                for (Article article : articles) {
	                    System.out.println(article);
	                }
	            }
               session.getTransaction().commit();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


