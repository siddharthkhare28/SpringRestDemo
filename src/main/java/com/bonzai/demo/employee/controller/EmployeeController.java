package com.bonzai.demo.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bonzai.demo.employee.model.Employee;
import com.bonzai.demo.employee.service.EmployeeService;

@RestController
class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
		
		Employee employee = employeeService.getEmployee(id);
		return ResponseEntity.ok().body(employee);
	}

}

