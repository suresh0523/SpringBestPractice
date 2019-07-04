package com.hcl.sample.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	private String name;
	
	@Id
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
