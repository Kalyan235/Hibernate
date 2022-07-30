package com.clint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Department;
import com.model.Employee2;

public class OtmMap {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		Employee2 employee2 = new Employee2();
		employee2.setEname("Kaala");
		employee2.setEsalary(30000);

		Department department = new Department();
		department.setDid(1);
		department.setDname("Maining");

		employee2.setDepartment(department);

		session.save(employee2);

		session.beginTransaction().commit();
		session.close();
		System.out.println("Done");
	}

}
