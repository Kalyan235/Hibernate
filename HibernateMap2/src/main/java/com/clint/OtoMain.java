package com.clint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Adress;
import com.model.Employee;

public class OtoMain {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		Employee employee = new Employee();

		employee.setEname("Octavia");
		employee.setEsalary(25000);

		Adress adress = new Adress();
		adress.setAloc("Ashok Nagar");

		employee.setAdress(adress);

		session.save(employee);

		session.beginTransaction().commit();
		session.close();
		System.out.println("Done");
	}

}
