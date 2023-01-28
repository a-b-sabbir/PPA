package com.unisoft.PPA.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Designation {
    @Id
    @GeneratedValue()
    private Integer id;
    private String name;
    @OneToOne(mappedBy = "designation", cascade = CascadeType.ALL)
    private Employee employee;

	public Designation() {
		super();
	}

	public Designation(Integer id, String name, Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
    
}
