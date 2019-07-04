package com.hcl.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.sample.pojo.Employee;
import com.hcl.sample.service.EmployeeService;

@RestController
@RequestMapping
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/employees")
	public List<Employee> employees(@RequestParam(required = false , value="name") String name, @RequestParam(required = false ,value="id") Long id) {
		return employeeService.employees(name, id);
	}
	
	@PostMapping("/employees")
	public Employee employees(@RequestBody Employee emp) {
		
		return employeeService.employees(emp);
		
	}
	
	@PutMapping("/employees")
	public List<Employee> employee(@RequestParam(required = false , value="name") String name, @RequestParam(required = false ,value="id") Long id) {
		
		return employeeService.employee(name,id);
	}
	
	@DeleteMapping("/employees")
	public String employe(@PathVariable(required = false , value="name") String name, @PathVariable(required = false ,value="id") Long id) {
		return employeeService.employe(name, id);
		
	}

}
