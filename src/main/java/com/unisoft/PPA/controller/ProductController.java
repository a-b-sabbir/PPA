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
import com.unisoft.PPA.repository.EmployeeRepo;
import com.unisoft.PPA.repository.ProductRepo;

@Controller
public class ProductController {

	@Autowired
	private ProductRepo productrepo;
	@Autowired
	private EmployeeRepo employeerepo;
	@Autowired
	DesignationRepo designationRepo;

	@GetMapping("/products/new")
	public String showNewProductForm(Model model) {
		List<Employee> listEmployee = employeerepo.findAll();
		List<Products> listProducts = productrepo.findAll();
		List<Designation> listDesignation = designationRepo.findAll();
		model.addAttribute("product", new Products());		
		model.addAttribute("listDesignation", listDesignation);
		model.addAttribute("listEmployee", listEmployee);
		model.addAttribute("listProducts", listProducts);

		return "product_form";
	}

	@PostMapping("/products/save")
	public String saveProduct(Products product) {
		List<Products> selectedOptions = productrepo.findAllById(product.getSelectedOptionIds());
		productrepo.save(product);
		productrepo.saveAll(selectedOptions);
		return "redirect:/products";
	}

	@GetMapping("/products")
	public String listProducts(Model model) {
		List<Products> listProducts = productrepo.findAll();
		model.addAttribute("product", new Products());
		model.addAttribute("listProducts", listProducts);
		return "products";
	}

}
