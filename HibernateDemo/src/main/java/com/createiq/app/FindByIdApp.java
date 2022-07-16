package com.createiq.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.model.Student;

public class FindByIdApp {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sf = configuration.buildSessionFactory();

		Session session = sf.openSession();

		Student student = (Student) session.get(Student.class, 102);

		System.out.println(student);
  
		session.close();
	}

}
