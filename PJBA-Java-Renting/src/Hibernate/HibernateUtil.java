package Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private HibernateUtil() {}
	private static SessionFactory sessionFactory;
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration config = new Configuration();
			config.configure();
//			config.addAnnotatedClass(annotatedClass);
			sessionFactory = config.buildSessionFactory();
		}
		return sessionFactory;
	}
}
