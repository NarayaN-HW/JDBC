package utils;


import java.sql.SQLException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import entity.Article;
import entity.Catogery;

public class HibernateUtils {

//	private static Connection dbConnection;

	public static SessionFactory buildConnection() throws SQLException {
		Configuration config = new Configuration();
		Properties hibernateProperty = new Properties();
		hibernateProperty.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		hibernateProperty.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/online_bookshop"); // create
		// or
		// database
//		create database association_mapping;
		hibernateProperty.put("hibernate.connection.username", "root");
		hibernateProperty.put("hibernate.connection.password", "password");
		hibernateProperty.put("hibernate.show_sql", "true");
		hibernateProperty.put("hibernate.hbm2ddl.auto", "update");
		config.setProperties(hibernateProperty);

		// mapping resource
		config.addAnnotatedClass(Article.class);
		config.addAnnotatedClass(Catogery.class);

		return config.buildSessionFactory();
	}
}
