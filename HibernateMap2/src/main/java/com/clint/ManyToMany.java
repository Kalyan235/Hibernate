package com.clint;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee3;
import com.model.Projects;

public class ManyToMany {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

		Employee3 employee3 = new Employee3();
		employee3.setEname("vikram");
		employee3.setEsalary(45000);

		Projects p1 = new Projects();
		p1.setPname("E_medico");

		Projects p2 = new Projects();
		p2.setPname("E-commers");

		List<Projects> projects = new ArrayList<>();
		projects.add(p1);
		projects.add(p2);

		employee3.setProjects(projects);

		session.save(employee3);

		session.beginTransaction().commit();
		session.close();
	}
}
