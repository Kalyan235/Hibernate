package com.clint;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;
import com.modelmap.Laptop;

public class Mapmain {

	private static Logger logger = Logger.getLogger(Mapmain.class);

	public static void main(String[] args) {
		logger.info("Connection Started");

		Laptop laptop = new Laptop();
		laptop.setLid(101);
		laptop.setName("Dell");

		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("Vikram");
		employee.setEsalary(250000);
		employee.setLaptop(laptop);

		Configuration config = new Configuration().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
		config.configure("hibernate.cfg.xml");

		SessionFactory sf = config.buildSessionFactory();

		Session session = sf.openSession();
		logger.info("Session is created " + session);

		session.save(laptop);
		session.save(employee);

		session.beginTransaction().commit();
		session.close();
		logger.info("Session is closed: " + session);

	}

}
