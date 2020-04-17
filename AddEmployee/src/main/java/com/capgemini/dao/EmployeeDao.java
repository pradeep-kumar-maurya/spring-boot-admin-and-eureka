package com.capgemini.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.bean.Employee;

@Repository
public class EmployeeDao implements EmployeeDaoI{

	@PersistenceContext
	private EntityManager em;
	@Override
	public Employee addEmployee(Employee emp) {
		em.persist(emp);
		return emp;
	}
	
}
