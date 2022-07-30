package com.controller;

import java.util.List;

import com.entity.Employee;
import com.entity.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

public class StudentController {

	StudentService studentService = new StudentServiceImpl();

	public void save(Student student) {
		studentService.save(student);
	}

	public void update(Student student) {

		studentService.update(student);
	}

	public void delete(Student student) {

		studentService.delete(student);
	}

	public List<Student> findAll() {
		return studentService.findAll();
	}

	public Student findById(int sid) {
		return studentService.findById(sid);
	}

}
