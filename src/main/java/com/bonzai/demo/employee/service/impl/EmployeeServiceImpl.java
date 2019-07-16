package com.bonzai.demo.employee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bonzai.demo.employee.model.Employee;
import com.bonzai.demo.employee.repository.EmployeeRepository;
import com.bonzai.demo.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public Employee getEmployee(Long id){
		Employee employee = repository.getOne(id);
		return employee;
	}
	
}
