package com.capgemini.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.Employee;
import com.capgemini.dao.EmployeeDaoI;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceI{

	@Autowired
	private EmployeeDaoI dao;
	
	@Override
	public Employee addEmployee(Employee emp) {
		return dao.addEmployee(emp);
	}
}