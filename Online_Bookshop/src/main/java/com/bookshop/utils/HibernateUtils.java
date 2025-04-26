package com.bookshop.utils;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.bookshop.entity.Author;
import com.bookshop.entity.Book;

public class HibernateUtils {

	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration();
		Properties hibernateProperty = new Properties();
		hibernateProperty.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		hibernateProperty.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/online_bookshop"); // create																									// schema
																											// or
		// database
//		create database association_mapping;
		hibernateProperty.put("hibernate.connection.username", "root");
		hibernateProperty.put("hibernate.connection.password", "password");
		hibernateProperty.put("hibernate.show_sql", "true");
		hibernateProperty.put("hibernate.hbm2ddl.auto", "update");
		config.setProperties(hibernateProperty);

		// mapping resource
		config.addAnnotatedClass(Book.class);
		config.addAnnotatedClass(Author.class);

		return config.buildSessionFactory();
	}
}
