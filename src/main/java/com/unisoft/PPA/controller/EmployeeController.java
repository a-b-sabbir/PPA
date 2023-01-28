package com.unisoft.PPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.unisoft.PPA.entity.Designation;
import com.unisoft.PPA.entity.Employee;
import com.unisoft.PPA.repository.DesignationRepo;
import com.unisoft.PPA.repository.EmployeeRepo;


@Controller
public class EmployeeController {
	@Autowired
	private EmployeeRepo employeerepo;
	@Autowired
	private DesignationRepo designationRepo;
	
	@GetMapping("/employee")
	public String listEmployee(Model model) {
		List<Employee> listEmployee= employeerepo.findAll();
		model.addAttribute("listEmployee" , listEmployee);
		return "employee";
	}
	
	@GetMapping("/employee/new")
	public String showEmployeeNewForm(Model model) {
		model.addAttribute("employee" , new Employee());
		List<Designation> listDesignation = designationRepo.findAll();
		model.addAttribute("listDesignation" , listDesignation);
		return "employee_form";
	}
	
	@PostMapping("/employee/save")
	public String saveEmployee(Employee employee) {
		employeerepo.save(employee);
		return "redirect:/employee";
	}

}
