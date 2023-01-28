package com.unisoft.PPA.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private List<Integer> selectedOptionIds;
	@ManyToOne
	@JoinColumn(name ="employee_id")
	private Employee employee;
	public Products() {
		super();
	}
	public Products(Integer id, List<Integer> selectedOptionIds, Employee employee) {
		super();
		this.id = id;
		this.selectedOptionIds = selectedOptionIds;
		this.employee = employee;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Integer> getSelectedOptionIds() {
		return selectedOptionIds;
	}
	public void setSelectedOptionIds(List<Integer> selectedOptionIds) {
		this.selectedOptionIds = selectedOptionIds;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

	

}