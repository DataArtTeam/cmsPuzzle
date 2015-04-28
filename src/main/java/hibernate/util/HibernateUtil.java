package hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	 private static ServiceRegistry sr;
	private HibernateUtil() {
	}

	static {
		try {
			Configuration cfg = new Configuration().configure();
//			sessionFactory = cfg.buildSessionFactory();

			 sr = new
			 ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
			 sessionFactory = cfg.buildSessionFactory(sr);
		} catch (Exception e) {
			e.printStackTrace();
//			throw new ExceptionInInitializerError(e);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
