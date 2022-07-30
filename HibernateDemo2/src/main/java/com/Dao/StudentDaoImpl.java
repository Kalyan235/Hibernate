package com.Dao;

import java.util.List;

import org.hibernate.Session;

import com.entity.Employee;
import com.entity.Student;
import com.util.SessionUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void save(Student student) {

		Session session = SessionUtil.getSession();
		session.save(student);

		session.beginTransaction().commit();

		SessionUtil.close(session);

	}

	@Override
	public void update(Student student) {

		Session session = SessionUtil.getSession();

		session.update(student);

		session.beginTransaction().commit();

		SessionUtil.close(session);

	}

	@Override
	public void delete(Student student) {

		Session session = SessionUtil.getSession();
		session.delete(student);

		session.beginTransaction().commit();

		SessionUtil.close(session);

	}

	@Override
	public List<Student> findAll() {
		return SessionUtil.getSession().createQuery("From Student").list();
	}

	@Override
	public Student findById(int sid) {

		return (Student) SessionUtil.getSession().get(Student.class, sid);
	}

}
