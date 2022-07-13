package com.springboot.project.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.project.model.Empolyee;
import com.springboot.project.repository.EmployeeRepository;
import com.springboot.project.service.EmployeeService;

import antlr.collections.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {
     
	private EmployeeRepository employeeRespository;
	
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRespository) {
		super();
		this.employeeRespository = employeeRespository;
	}



	@Override
	public Empolyee saveEmployee(Empolyee empolyee) {
		return employeeRespository.save(empolyee);
		
	}



	@Override
	public java.util.List<Empolyee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRespository.findAll();
	}


	
	
}
