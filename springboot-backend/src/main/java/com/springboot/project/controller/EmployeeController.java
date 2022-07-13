package com.springboot.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.springboot.project.model.Empolyee;
import com.springboot.project.service.EmployeeService;

//import antlr.collections.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController<Employee> {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	// build create employee REST API
	@PostMapping()
	public ResponseEntity<Empolyee> saveEmployee(@RequestBody Empolyee employee){
		 
		return new ResponseEntity<Empolyee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	
	//build get all employee REST API
	@GetMapping
	public List<Empolyee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	
}
