package com.clint;

import com.controller.StudentController;
import com.entity.Student;

public class StudentAppTest {

	public static void main(String[] args) {

		StudentController controller = new StudentController();

		Student student = new Student(107, "llk ", 8000);

		controller.save(student);

		// System.out.println(controller.findById(102));

	}

}
