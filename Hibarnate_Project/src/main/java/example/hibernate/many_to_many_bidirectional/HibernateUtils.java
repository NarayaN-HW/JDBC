package example.hibernate.many_to_many_bidirectional;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	public static SessionFactory getSessionFactory() {
		Configuration conf = new Configuration();
		Properties hibernateProperty = new Properties();
		hibernateProperty.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		hibernateProperty.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/association_mapping"); // create
																												// met
																												// schema
																												// or
		// database
//		create database association_mapping;

		hibernateProperty.put("hibernate.connection.username", "root");
		hibernateProperty.put("hibernate.connection.password", "password");
		hibernateProperty.put("hibernate.show_sql", "true");
		hibernateProperty.put("hibernate.hbm2ddl.auto", "update");
		conf.setProperties(hibernateProperty);

		// mapping resource
		conf.addAnnotatedClass(Certification.class);
		conf.addAnnotatedClass(Candidate.class);

//		obtaining session
		SessionFactory factory = conf.buildSessionFactory();

		return factory;

	}
}
