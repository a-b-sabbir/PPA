package com.unisoft.PPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unisoft.PPA.entity.Designation;

@Repository
public interface DesignationRepo extends JpaRepository<Designation, Integer>{
    
}
