package com.hadiuz.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// connection configuration
public class HibernateUtil {
	
	public static Session makeSession() {
		Configuration confi = new Configuration();
//		confi.configure("hibernate.cfg.xml");
		confi = confi.configure();
		System.out.println("got configuration..."+confi);
		// singleton object (Multiple object creation is not allowed)
		SessionFactory sessionFactory = confi.buildSessionFactory();
		System.out.println("session factory is ready "+sessionFactory);
		// open a new session
		Session session = sessionFactory.openSession();
		return session;
	}
}

