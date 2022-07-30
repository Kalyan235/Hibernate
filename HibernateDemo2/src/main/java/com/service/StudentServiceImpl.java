package com.service;

import java.util.List;

import com.Dao.StudentDao;
import com.Dao.StudentDaoImpl;
import com.entity.Student;

public class StudentServiceImpl implements StudentService {

	StudentDao dao = new StudentDaoImpl();

	@Override
	public void save(Student student) {

		dao.save(student);
	}

	@Override
	public void update(Student student) {

		dao.update(student);
	}

	@Override
	public void delete(Student student) {

		dao.delete(student);
	}

	@Override
	public List<Student> findAll() {
		return dao.findAll();
	}

	@Override
	public Student findById(int sid) {
		return dao.findById(sid);
	}

}
