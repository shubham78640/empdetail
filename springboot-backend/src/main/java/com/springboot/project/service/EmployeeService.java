package com.springboot.project.service;

import com.springboot.project.model.Empolyee;
import java.util.List;
//import antlr.collections.List;

public interface EmployeeService {
Empolyee saveEmployee(Empolyee empolyee);
  List<Empolyee> getAllEmployees();


}
