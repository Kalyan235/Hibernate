package com.service;

import java.util.List;

import com.entity.Student;

public interface StudentService {

	public void save(Student student);

	public void update(Student student);

	public void delete(Student student);

	public List<Student> findAll();

	public Student findById(int sid);

}
