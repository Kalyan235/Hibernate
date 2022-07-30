package com.Dao;

import java.util.List;

import org.hibernate.Session;

import com.entity.Employee;
import com.util.SessionUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee employee) {

		Session session = SessionUtil.getSession();

		session.save(employee);

		session.beginTransaction().commit();

		SessionUtil.close(session);

	}

	@Override
	public void update(Employee employee) {

		Session session = SessionUtil.getSession();

		session.update(employee);

		session.beginTransaction().commit();

		SessionUtil.close(session);

	}

	@Override
	public void delete(Employee employee) {

		Session session = SessionUtil.getSession();

		session.delete(employee);

		session.beginTransaction().commit();

		SessionUtil.close(session);

	}

	@Override
	public List<Employee> findAll() {

		return SessionUtil.getSession().createQuery("From Employee").list();

	}

	@Override
	public Employee findById(int eid) {

		return (Employee) SessionUtil.getSession().get(Employee.class, eid);
	}

}
