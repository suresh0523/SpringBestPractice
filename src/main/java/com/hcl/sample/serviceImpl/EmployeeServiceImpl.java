package com.hcl.sample.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.sample.pojo.Employee;
import com.hcl.sample.repo.EmployeeRepo;
import com.hcl.sample.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepo employeeRepo;

	@Override
	public List<Employee> employees(String name,Long id) {
		List<Employee> li= new ArrayList<>();
		if(id==null && name==null) {
		li=employeeRepo.findAll();
		}
		else if(id!=null) {
			Employee emp= employeeRepo.findById(id).get();
			li.add(emp);
		}
		return li;
	}

	@Override
	public Employee employees(Employee emp) {
		
		return employeeRepo.save(emp);
	}

	@Override
	public List<Employee> employee(String name,Long id) {
		List<Employee> li= employeeRepo.findAll();
		Employee emp= new Employee();
		for (Employee employee : li) {		
		if(id==null && name==null) {
			employee.setName("Shiva");
			employeeRepo.save(employee);
			li.add(employee);
			}
		}
		if(id!=null) {
			emp= employeeRepo.findById(id).get();
			emp.setId(id);
			emp.setName("suresh");
			emp=employeeRepo.save(emp);
			li.add(emp);
		}
		return li;
	}

	@Override
	public String employe(String name, Long id) {
		Employee emp= employeeRepo.findById(id).get();
		if(name==null && id==null) {
			employeeRepo.deleteAll();
		}
		else if(emp!=null) {
			employeeRepo.deleteById(id);
		}
		return "deleted";
	}

}
