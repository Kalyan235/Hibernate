package com.clint;

import java.util.ArrayList;
import java.util.List;

import com.controller.EmployeeController;
import com.entity.Employee;

public class EmployeeAppTest {

	public static void main(String[] args) {

		EmployeeController controller = new EmployeeController();

//		System.out.println("<=== Employee save Start ===>");
//
		Employee employee = new Employee(10003, "Vram daya", 35000);

		controller.save(employee);

//		System.out.println("<=== Employee save End ===>");
//
//		System.out.println(controller.findById(1002));

//		System.out.println("<=== Employee update Start ===>");
//
//		Employee employee = new Employee(1001, "Octavia ", 25000);
//
//		controller.update(employee);
//
//		System.out.println("<=== Employee update End ===>");

//		List<Employee> list = new ArrayList<>();
//		list = controller.findAll();
//
//		for (Employee employee2 : list) {
//
//			System.out.println(employee2);
//		}

//		Employee employee = new Employee(1002, "Vikram", 35000);
//
//		controller.delete(employee);
//
	}

}
