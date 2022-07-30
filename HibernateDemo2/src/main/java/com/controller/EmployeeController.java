package com.controller;

import java.util.List;

import com.entity.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class EmployeeController {

	private EmployeeService employeeService = new EmployeeServiceImpl();

	public void save(Employee employee) {

		employeeService.save(employee);

	}

	public void update(Employee employee) {
		employeeService.update(employee);
	}

	public void delete(Employee employee) {
		employeeService.delete(employee);
	}

	public List<Employee> findAll() {
		return employeeService.findAll();
	}

	public Employee findById(int eid) {

		return employeeService.findById(eid);

	}
}
