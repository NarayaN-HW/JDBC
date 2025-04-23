package example.hibernate.utils;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import example.hibernate.entity.Students;

public class HibernateUtils {

	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		Properties hibernateProperty = new Properties();
		hibernateProperty.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		hibernateProperty.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/met"); // create met schema or
																								// database
//		create database met;
		
		hibernateProperty.put("hibernate.connection.username", "root");
		hibernateProperty.put("hibernate.connection.password", "password");
		hibernateProperty.put("hibernate.show_sql", "true");
		hibernateProperty.put("hibernate.hbm2ddl.auto", "update");
		conf.setProperties(hibernateProperty);

		// mapping resource
		Class<Students> entityclass = Students.class;
		conf.addAnnotatedClass(entityclass);

//		obtaining session
		SessionFactory factory = conf.buildSessionFactory();

		return factory;

	}
}
