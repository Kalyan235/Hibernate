package com.Dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeeDao {

	public void save(Employee employee);

	public void update(Employee employee);

	public void delete(Employee employee);

	public List<Employee> findAll();

	public Employee findById(int eid);

}
