package com.springboot.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.project.model.Empolyee;


public interface EmployeeRepository extends JpaRepository<Empolyee, Long> {

}
