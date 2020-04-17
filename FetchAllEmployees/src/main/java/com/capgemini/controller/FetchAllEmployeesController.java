package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Employee;
import com.capgemini.service.EmployeeServiceI;

@RestController
public class FetchAllEmployeesController {
	
	@Autowired
	private EmployeeServiceI service;
	
	@GetMapping("/list/Employees")
	public List<Employee> listEmployees(){
		List<Employee> list = service.getAllEmployees();
		return list;
	}
}
