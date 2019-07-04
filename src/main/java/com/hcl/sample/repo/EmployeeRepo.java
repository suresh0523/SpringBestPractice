package com.hcl.sample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.sample.pojo.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

}
