package com.hcl.sample.service;

import java.util.List;

import com.hcl.sample.pojo.Employee;

public interface EmployeeService {
	
	public List<Employee> employees(String name,Long id);
	
	public Employee employees(Employee emp);
	
	public List<Employee> employee(String name,Long id);
	
	public String employe(String name,Long id);
}
