package com.unisoft.PPA.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.unisoft.PPA.entity.Designation;
import com.unisoft.PPA.entity.Employee;
import com.unisoft.PPA.entity.Products;
import com.unisoft.PPA.repository.DesignationRepo;

@Controller
public class DesignationController {
	
	
	@Autowired
	private DesignationRepo designationRepo;

	
	
	@GetMapping("/designation/new")
	public String showNewDesignationForm(Model model) {
		model.addAttribute("designation", new Designation());
		return "designation_form";
	}
	
	@PostMapping("/designation/save")
	public String saveCategory(Designation designation) {
		designationRepo.save(designation);
		return "index";
	}
}
