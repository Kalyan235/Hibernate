package com.service;

import java.util.List;

import com.Dao.EmployeeDao;
import com.Dao.EmployeeDaoImpl;
import com.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao daoImpl=new EmployeeDaoImpl();
	
	@Override
	public void save(Employee employee) {
		
		daoImpl.save(employee);
		
	}

	@Override
	public void update(Employee employee) {
		daoImpl.update(employee);		
	}

	@Override
	public void delete(Employee employee) {
		daoImpl.delete(employee);		
	}

	@Override
	public List<Employee> findAll() {
		return daoImpl.findAll();
	}

	@Override
	public Employee findById(int eid) {
		
		return daoImpl.findById(eid);
		
	}

}
