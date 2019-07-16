package com.bonzai.demo.employee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	private @Id @GeneratedValue Long id;
	private String name;
	private String role;

	Employee() {}

	Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
}
