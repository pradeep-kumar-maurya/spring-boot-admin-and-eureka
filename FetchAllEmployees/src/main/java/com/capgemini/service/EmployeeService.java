package com.capgemini.service;

import java.util.List;

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
	public List<Employee> getAllEmployees() {
		List<Employee> list = dao.getAllEmployees();
		return list;
	}
}
