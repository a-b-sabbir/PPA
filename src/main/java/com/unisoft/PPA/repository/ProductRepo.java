package com.unisoft.PPA.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unisoft.PPA.entity.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

	
	
}
