package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

	private static SessionFactory sf;

	static {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		sf = configuration.buildSessionFactory();

	}

	public static Session getSession() {

		Session session = sf.openSession();
		return session;

	}

	public static void close(Session session) {

		if (session != null) {

			session.close();
		}
	}

}
