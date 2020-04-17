package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Employee;
import com.capgemini.service.EmployeeServiceI;

@RestController
public class AddController {
	
	@Autowired
	private EmployeeServiceI service;
	
	@PostMapping("/add/Employee")
	public String addEmployee(@RequestBody Employee emp) {
		Employee e = service.addEmployee(emp);
		if(e != null) {
			return "Employee was added successfully!!";
		}
		else {
			return "Sorry, employee was not added";
		}
	}
}
